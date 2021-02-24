package com.example.heap;

public class MyPriorityQueue {
    private Integer[] array;
    private int size;

    public MyPriorityQueue() {
        //简单起见，不考虑扩容
        array=new Integer[100];
        size=0;
    }
   //返回队首元素
    public Integer element(){
        if(size==0){
            throw new RuntimeException("空了" );
        }
        return array[0];
    }

    //返回并删除队首元素
    public Integer remove(){
        if(size==0){
            throw new RuntimeException("空了" );
        }
        int e=array[0];
        //将堆的最后一个元素拿到第一位（堆首），此时满足向下调整的条件
        array[0]=array[size-1];

        //将堆首（0号下标）进行向下调整
        Heap.AdjustDown(array, size, 0);
        return e;
    }
    //插入一个元素
    //时间复杂度O（log（n））
    public void add(Integer e){
       array[size]=e;
       size++;
       Heap.AdjustUp(array, size, size-1);
    }
}
