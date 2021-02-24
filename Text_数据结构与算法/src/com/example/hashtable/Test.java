package com.example.hashtable;

public class Test {
    public static void main(String[] args) {
        int []elements={103,29,38,4,7,55,907,32};
        MyHashTable hashTable=new MyHashTable();
        for (int e:elements) {
            hashTable.insert(e);
        }
        System.out.println(hashTable.contains(103));
        System.out.println(hashTable.contains(81));;
        System.out.println(hashTable.remove(4));
        System.out.println(hashTable.remove(38));
        System.out.println(hashTable.remove(55));
        System.out.println(hashTable.remove(9));

    }

}
