


package com.company;

import java.util.Arrays;

public class MyArrayList {
    int usedSize;//有效数据的个数
    int[] elem;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[10];
    }

    public void add(int pos, int data) {   //在pos位置新增元素
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("输入位置不合法");
        }
        if (this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);  //扩容
        }
        for (int i = this.usedSize - 1; i > pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public void print() {//打印
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(elem[i]);
        }
        System.out.println();
    }

    public boolean contains(int tofind) {//查找是否包含所寻找的值
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == tofind) {
                System.out.println("已找到");
                return true;
            }
        }
        System.out.println("未找到");
        return false;
    }

    public int search(int tofind) {//查找是否有所寻找的值，若有，返回下标
        int result = 0;
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == tofind) {
                result = i;
                System.out.println("下标为" + result);
                return i;
            }
        }
        System.out.println("未找到");
        return -1;
    }

    public int getpos(int tofind) {//查找是否有所寻找的值，若有，返回该值
        int data = 0;
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == tofind) {
                data = this.elem[i];
                System.out.println("data=" + data);
                return data;
            }
        }
        System.out.println("未找到");
        return -1;
    }
    public void setpos(int pos,int data){//将pos位置的值改为data
        if(pos<0||pos>=this.usedSize){
            return;
        }
        this.elem[pos]=data;
    }

    public void MyArrayListLength(){//输出顺序表的长度
        int length=this.usedSize;
        System.out.println("length="+length);
    }

    public void DeleteAllData1(){//第一种情况：数组里面存放的是普通类型
        this.usedSize=0;
    }
    public void DeleteAllData2(){//第二种情况：数组里面存放的是引用类型
        for (int i = 0; i <this.usedSize ; i++) {
            //this.elem[i]=null;
        }
    }
    public void DeleteOneData(int toDelete){//删除指定元素：首先确定该元素位置，然后将其后面的元素依次向前移动一位
        int pos=0;
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toDelete){
                pos=i;
            }
        }
        for (int j=pos;j<this.usedSize-1;j++){
            this.elem[j]=this.elem[j+1];
        }
        this.usedSize--;
    }
}



