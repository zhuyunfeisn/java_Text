


package com.company;
//单项不带头循环链表
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;

    }
}

public class MyLinkedList {
    public Node head; //指向头节点

    public void print(){  //打印
        Node cur;
        cur=this.head;
        while(cur!=null){
            System.out.println(cur.data+"");
            cur=cur.next; //新的cur变为原来cur的next
        }
    }
    public int getlength(){ //找该链表的长度
        int usedSize=0; //有效长度
        Node cur=this.head;
        while (cur!=null){
            cur=cur.next;
            usedSize++;
        }
        return usedSize;
    }

    public boolean IndexLawful(int index){ //判断index（位置）是否合法
        if(index<0||index>this.getlength()){
            return false;
        }else{
            return true;
        }
    }

    public void addFirstData(int data){//头插法
        Node node=new Node(data);
        node.next=head;
        this.head=node;
    }

    public void addLastData(int data){//尾插法
        Node node=new Node(data);
        if(this.head==null){           //考虑当该链表一个结点都没有的时候的情况
            this.head=node;
        }else{
            Node cur=this.head;
            while (cur.next!=null){      //寻找尾结点
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    public void addIndexData(int index,int data){//从任意位置插入（插入位置为index）
        Node node=new Node(data);
        if(this.IndexLawful(index)){
            if(index==0){
                this.addFirstData(data);
                return;
            }
            if(index==this.getlength()){
                this.addLastData(data);
                return;
            }
            Node cur=this.head;
            for (int i = 1; i <index-1 ; i++) {
                cur=cur.next;
            }
            node.next=cur.next;
            cur.next=node;
        }
    }

    public Node SearchPrey(int index){//寻找index的前驱
        Node cur=this.head;
        int count=0;
        while (count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    public boolean contains(int key){//查找key的值是否在该链表当中
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }else{
                cur=cur.next;
            }
        }
        return false;
    }

    // 删除节点数据为key的结点
    public Node SearchKeyPrey(int key){  //寻找key的前驱节点
        Node cur=this.head;
        while (cur.next!=null){    // 当cur为最后一项时，没找到，若是cur！=null，则会超出范围
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public void RemoveOneData(int key){
        if(this.head==null){
            return;
        }
        if(this.head.data==key){
            this.head.next=this.head;
            return;
        }
        Node cur=this.SearchKeyPrey(key);
        cur.next=cur.next.next;
    }


    public void RemoveAllData(int key){
        Node cur=head.next;   //cur指向第二个节点，然后指向需要删除的节点
        Node prev=head;       //prev指向cur的前驱
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.data==key){    //先删除除头节点外的其他节点，再删除头节点
            head=head.next;
        }
    }

    public void CleanLinkedList(){
        this.head=null;           //将头节点置为空，则后续节点都没有被引用，系统会自动回收
    }



















}


