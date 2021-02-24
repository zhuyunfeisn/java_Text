package com.example.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetUse {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        System.out.println(set.add("apple"));
        System.out.println(set.add("peach"));
        System.out.println(set.add("banana"));
        System.out.println(set.add("oranges"));
        System.out.println(set.size());
        System.out.println(set);

        System.out.println(set.add("apple"));
        System.out.println(set.contains("watermelon"));
        System.out.println(set.contains("apple"));

        System.out.println(set.remove("watermelon"));
        System.out.println(set.remove("apple"));
        System.out.println(set);

       set.clear();
        System.out.println(set.size());


        //迭代器：遍历set
        Iterator<String> iterator=set.iterator();
          while (iterator.hasNext()){
              String fruit=iterator.next();
              System.out.println(fruit);
          }
    }

}
