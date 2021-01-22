package company.com;
import java.util.ArrayList;
public class TextArrayList {
    public static void main(String[] args) {
ArrayList arrayList=new ArrayList();
arrayList.add(5);
arrayList.add(1,5);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
       arrayList.add(0,6);
        System.out.println(arrayList);
        Object []object=arrayList.toArray();
        for (int i = 0; i <object.length ; i++) {
            System.out.println(object[i]);
        }
    }
}
