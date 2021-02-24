package com.example.hashtable;

//元素类型，使用Integer
//使用拉链法解决冲突
public class MyHashTable {

    //1.数组（存储链表的头节点）
    private Node[] array=new Node[11];

    //2.维护hash表中元素的个数
    private int size;

    //true:key之前不在hash表中
    //false:key之前在hash表中
    public boolean insert(Integer key) {
        //1.把对象转成int类型，调用类的hashCode（）方法
        int hashValue = key.hashCode();
        //2.把hashValue转成合法的下标
        int index = hashValue % array.length;
        //3.遍历index下标的链表，看看key在不在链表中
        Node current = array[index];
        while (current != null) {
            if (key.equals(current.key)) {
                return false;
            }
            current = current.next;
        }
        //4.把key装入结点中，并插入到对应的链表中
        //头插
        Node node = new Node(key);
        node.next = array[index];
        array[index] = node;
        //5.维护元素个数
        size++;

        return true;
    }

    public boolean contains(Integer key){
        int hashValue=key.hashCode();
        int index=hashValue%array.length;
        Node current=array[index];
        while (current!=null){
            if(current.key.equals(key)){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //true代表key在哈希表中，且删除成功
    //false代表key不在哈希表中，删除失败
    public boolean remove(Integer key){
        int hashValue=key.hashCode();
        int index=hashValue%array.length;
        Node current=array[index];
        Node parent=null;
        while (current!=null){
            if(current.key.equals(key)){
                break;
            }
            parent=current;
            current=current.next;
        }
        if(current==null){
            //不存在key
            return false;
        }else if(parent==null){
            //current是头节点
            array[index]=array[index].next;
            size--;
            return true;
        }else {
            parent.next=current.next;
            size--;
            return true;
        }
    }
}
