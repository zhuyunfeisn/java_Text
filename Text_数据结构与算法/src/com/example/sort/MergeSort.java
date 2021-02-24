package com.example.sort;
//归并排序
public class MergeSort {
    public static void mergeSort(long[]array){
        mergeSortInternal(array,0,array.length);

    }

    //区间范围是左闭右开
    //array[lowIndex,highIndex)
    private static void mergeSortInternal(long[] array, int lowIndex, int highIndex) {

        int size=highIndex-lowIndex;
        if(size<=1){
            return;
        }
        int middleIndex=(highIndex+lowIndex)/2;
        //区间被分成左右两份
        //左区间：[lowIndex,middleIndex)
        //右区间: [middleIndex,highIndex)


        //递归
        mergeSortInternal(array, lowIndex, middleIndex);
        mergeSortInternal(array, middleIndex, highIndex);


         //左右两个区间都有序
        mergeLeftAndRight(array,lowIndex,middleIndex,highIndex);


    }

    //合并两个有序区间
    private static void mergeLeftAndRight(long[] array, int lowIndex, int middleIndex, int highIndex) {
        //两个区间数的总数
        int size=highIndex-lowIndex;
        long[]extraArray=new long[size];

        //遍历（三个下标，一个数组一个）
        int leftIndex=lowIndex;
        int rightIndex=middleIndex;
        int extraIndex=0;

        //两个队伍都有人
        while (leftIndex<middleIndex&&rightIndex<highIndex){
            //加等于保证稳定性
            if(array[leftIndex]<=array[rightIndex]){
                extraArray[extraIndex]=array[leftIndex];
                leftIndex++;
            }else {
                extraArray[extraIndex]=array[rightIndex];
                rightIndex++;
            }
            extraIndex++;
        }

        //直到有个队伍没有人
        if(leftIndex<middleIndex){
            //左边队伍有人
            while (leftIndex<middleIndex){
                extraArray[extraIndex++]=array[leftIndex++];
            }
        }else {
            //右边队伍有人
            while (rightIndex<highIndex){
                extraArray[extraIndex++]=array[rightIndex++];
            }
        }

        //最后把数据从extraArray新数组搬回去
        //新数组extraArray[0,size)
        //搬回去的下标范围[lowIndex,highIndex)
        for (int i = 0; i <size; i++) {
            array[i+lowIndex]=extraArray[i];
        }
    }
   

}
