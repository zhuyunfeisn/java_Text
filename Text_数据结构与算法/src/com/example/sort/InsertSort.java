package com.example.sort;
//直接插入排序
public class InsertSort {
    public static void insertSort(long []array){
        //数据一共有array.length个
        //所以，子操作需要执行array.length次
        //减不减一都可以，减一认为第一个数已经有序
        for (int i = 0; i <array.length-1 ; i++) {
            //有序[0,i+1)  例如刚开始[0,1)有序
            //无序[i+1,array.length)
            //抓取出来的数是[i+1]

            long key=array[i+1];
            int j=0;
            //依次在有序区间进行比较
            for ( j = i; j>=0 ; j--) {
                //[j]就是需要和key比较的数
                /**
                 * key<array[j]   把array[j]往后移 继续往前比较
                 * key==array[j]  把key放入array[j]的后边
                 * key>array[j]   把key放入array[j]的后边
                 */
                if(key<array[j]){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=key;

        }
    }
}
