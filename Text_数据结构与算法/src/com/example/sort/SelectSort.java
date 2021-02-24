package com.example.sort;

public class SelectSort {
    //选择排序

    /**
     *选择大的数
     * 前面为有序区间，后面为无序区间
     * 再无序区间中遍历，找到最大的数，和无序区间的最后一个数进行交换
     */
    public static void selectSort(long[]array){
        //一共多少次选择的过程
        for (int i = 0; i <array.length ; i++) {
            //无序区间：[0,array.length-i)
            //有序区间：[array.length-i,array.length)
            //记录无序区间最后一个值的下标和值
            int maxindex=array.length-i-1;
            long key=array[array.length-i-1];
            for (int j = 0; j <array.length-i ; j++) {
                if(array[j]>key){
                    maxindex=j;
                    key=array[j];
                }
            }
            //期望maxIndex指向无序区间的最大值的下标
            //交换最大数所在下标和无序区间最后一个数的下标
            swap(array, maxindex, array.length-i-1);
        }
    }

    public static void swap(long[]array,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
}
