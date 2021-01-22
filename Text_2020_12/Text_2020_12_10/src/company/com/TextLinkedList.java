package company.com;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TextLinkedList {
    public static void main(String[] args) {
       /* LinkedList list=new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("E");
        list.addLast("F");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));*/
        ArrayList<Double> arrayList=new ArrayList<Double>();
        arrayList.add(10.2);
        arrayList.add(17.1);
        arrayList.add(12.3);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("ab");
        linkedList.add("ce");
        linkedList.addFirst("ef");
        linkedList.addLast("ce");
        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));
        }
        Vector<Character> vector=new Vector<Character>();
        vector.add('a');
        vector.add('b');
        vector.add('f');
        for (int i = 0; i <vector.size() ; i++) {
            System.out.println(vector.get(i));
        }
        }
    }


