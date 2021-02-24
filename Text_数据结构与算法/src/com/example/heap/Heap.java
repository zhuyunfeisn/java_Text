package com.example.heap;

public class Heap {
    //最坏时间复杂度是O（log（n））
    //建堆
    public static void BuildHeap(Integer array[],int size){
   //找到层序遍历最后一个结点的下标
        int lastIndex=size-1;
        //找到最后一个结点的父节点下标(最后一个不是叶子节点的下标）
        int lastParentIndex=(lastIndex-1)/2;//下标是从0开始
        //从[lastParentIndex，0]不断地向下调整(从后往前）
        for (int i=lastParentIndex;i>=0;i--){
            AdjustDown(array, size, i);
        }
    }



  //向下调整
    public static void AdjustDown(Integer []array,int size,int index ){
        while (true) {
            int leftindex=2*index+1;
            //index是叶子结点，直接return
            if(leftindex>=size){
                return;
            }
            //找最小的孩子
            int minIndex=leftindex;
            int rightIndex=leftindex+1;
            //存在右孩子，且右孩子的值比左孩子的小，将最小孩子小标改为右孩子
            if(rightIndex<size&&array[rightIndex]<array[leftindex]){
                minIndex=rightIndex;
            }
            //3.比较最小孩子的值和index位置的值
            if(array[index]<=array[minIndex]){
                return;
            }
            //4.交换
            int t=array[index];
            array[index]=array[minIndex];
            array[minIndex]=t;

            //5.把最小的孩子视为index，继续循环
            index=minIndex;
        }
    }


    //向上调整
    public static void AdjustUp(Integer []array,int size,int index){
        //1.判断index是不是树的根，如果是根调整结束
        //2.找到index的父节点
        //3.比较父节点的值和index的值
        //4.只要父节点的值<=index的值，调整结束
        //5.否则交换父节点和index的值
        //6.把父节点看作index，继续循环
        while (true) {
            if(index==0){
                break;
            }

            //找到index父节点的下标
            int ParentIndex=(index-1)/2;
            if(array[index]<array[ParentIndex]){
                int t=array[index];
                array[index]=array[ParentIndex];
                array[ParentIndex]=t;
            }else {
                break;
            }
            index=ParentIndex;
        }
    }
}
