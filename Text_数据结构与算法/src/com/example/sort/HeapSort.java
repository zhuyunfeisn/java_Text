package com.example.sort;
//堆排序
public class HeapSort {
    public static void heapSort(long[]array,int size){
       //1.建大堆
          bulidHeap(array,size);
        //2.进行选择的过程，一共需要array.length-1组
        for (int i = 0; i <array.length-1 ; i++) {
            //无序区间：[0,array.length-i)
            //有序区间：[array.length-i,array.length)
            swap(array,0,array.length-i-1);
            //此时无序区间：[0,array.length-i-1)
            //无序区间的个数为array.length-i-1
            adjustDown(array,array.length-i-1,0);
        }
    }
    //交换
    public static void swap(long[]array,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
    //建大堆
    public static void bulidHeap(long []array,int size){
        int lastNodeIndex=size-1;
        int lastParentIndex=(lastNodeIndex-1)/2;
        for (int i = lastParentIndex; i >=0 ; i--) {
            adjustDown(array,size,i);
        }


    }
    //向下调整
    public static void adjustDown(long[]array,int size,int index){
        while (true){
            //堆是完全二叉树，一定有左孩子
            int leftIndex=index*2+1;
            //如果没有左孩子，则为叶子结点,直接return
            //等于size也超出了数组下标范围
            if(leftIndex>=size){
                return;
            }
            //找最大的孩子
            int maxIndex=leftIndex;
            int rightIndex=leftIndex+1;
            //如果右孩子存在且右孩子的值大于左孩子，则将最大值的下标改为右孩子
            if(rightIndex<size&&array[rightIndex]>array[leftIndex]){
               maxIndex=rightIndex;
            }
            //比较maxIndex和index位置的值，如果maxIndex大，则交换，否则retrun
            if(array[maxIndex]<=array[index]){
                return;
            }
            swap(array, maxIndex, index);
            index=maxIndex;
        }
    }
}
