package com.example.sort;
//希尔排序(带间隔的插入排序）
public class ShellSort {
    public static void shellSort(long[]array){
        int gap=array.length/2;

        while (true){
            insertSortWithGap(array, gap);
            if(gap==1){
                break;
            }
            gap=gap/2;
        }
    }


    public static void insertSortWithGap(long[]array,int gap){
        //分为gap组，认为gap之前的都是有序的（每组一个数）
        for (int i =gap; i <array.length ; i++) {
            //记录需要比较的值
          long key=array[i];
          int j=0;
          //对每组的值进行插入排序，每组间隔为gap个
            for (j =i-gap; j >=0 ; j=j-gap) {
                if(key<=array[j]){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=key;
        }
    }
}
