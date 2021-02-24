package com.example.sort;
//冒泡排序
public class BubblingSort {
    public static void bubblingSort(long []array){
    //外层循环，需要多少次冒泡的过程
        for (int i = 0; i <array.length ; i++) {
            //无序区间：[0,array,length-i)
            //有序区间[array.length-i,array.length)

            //假设数组已经有序
            boolean isSorted=true;

            //冒泡过程
            //只在无序区间中进行
            //循环到无序区间的倒数第二个数，然后倒数第二会和倒数第一再比较
            for (int j  = 0; j  <array.length-i-1 ; j ++) {
                if(array[j]>array[j+1]){
                  swap(array, j, j+1);
                  //交换过，说明数组无序
                    isSorted=false;
                }
            }

            //如果数组有序，退出循环
            if(isSorted){
                break;
            }
        }
    }

    public static void swap(long []array,int i,int j){
     long t=array[i];
     array[i]=array[j];
     array[j]=t;
    }


}
