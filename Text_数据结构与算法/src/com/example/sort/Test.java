package com.example.sort;

import java.util.Arrays;
import java.util.Random;

public class Test {
    /**
     *测试四种情况
     * 1.随机生成的乱序数
     * 2.已经有序
     * 3.已经逆序
     * 4.完全相等
     * 5.测试不同规模的数据
     */


  //构建随机数组 10个元素
    public  static  long[] randomArray(){
        Random random=new Random(2021219);
        long[] array=new long[10];
        for (int i = 0; i <10 ; i++) {
            array[i]=random.nextInt(100);
        }
        return array;
    }




  //构建有序数组
    public static long[] orderlyArray(){
        long []array=randomArray();
        Arrays.sort(array);
        return array;
    }




    //构建逆序数组
    public static long[] reverseArray(){
        long[]array=orderlyArray();
        swap(array, 0, 9);
        swap(array, 1, 8);
        swap(array, 2, 7);
        swap(array, 3, 6);
        swap(array, 4, 5);
        return array;
    }
     public static void  swap(long[]array ,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
     }


    //构建完全相等的数组
     public static long[] sameArray(){
    long[]array=new long[10];
         for (int i = 0; i <10 ; i++) {
             array[i]=9;
         }
         return array;
     }



    // 插入排序
    public static void mainInsert(String[] args) {
        long[] a1=randomArray();
        System.out.println(Arrays.toString(a1));
        InsertSort.insertSort(a1);
        System.out.println(Arrays.toString(a1));

    }

    //冒泡排序
    public static void bubblingmain(String[] args) {
        long a1[]=randomArray();
        System.out.println(Arrays.toString(a1));
        BubblingSort.bubblingSort(a1);
        System.out.println(Arrays.toString(a1));
    }

    //选择排序
    public static void selectmain(String[] args) {
        long []a1=randomArray();
        System.out.println(Arrays.toString(a1));
        SelectSort.selectSort(a1);
        System.out.println(Arrays.toString(a1));
    }

    //堆排序
    public static void heapmain(String[] args) {
        long[]a=randomArray();
        System.out.println(Arrays.toString(a));
        HeapSort.heapSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    //希尔排序
    public static void shellmain(String[] args) {
        long[]a=randomArray();
        System.out.println(Arrays.toString(a));
        ShellSort.shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    //快速排序
    public static void quickmain(String[] args) {
        long[]a=randomArray();
        System.out.println(Arrays.toString(a));
        QuickSort.quickSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        long[]a=randomArray();
        System.out.println(Arrays.toString(a));
        MergeSort.mergeSort(a);
        System.out.println(Arrays.toString(a));

        long[]a1=sameArray();
        System.out.println(Arrays.toString(a1));
        MergeSort.mergeSort(a1);
        System.out.println(Arrays.toString(a1));

    }
}