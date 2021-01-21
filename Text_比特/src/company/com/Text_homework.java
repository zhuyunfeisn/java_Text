package company.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text_homework {
    public static void main21(String[] args) {
    String st1="abcdefg";
    String arr1="abc";
    String arr2="abcdefghk";
    String arr3="abcdefg";
        System.out.println(compareTo(st1,arr1));
        System.out.println(compareTo(st1,arr2));
        System.out.println(compareTo(st1,arr3));
    }
    public static int compareTo(String str,String arr) {
        char[] str1 = str.toCharArray();
        char[] arr1 = arr.toCharArray();
        if (str1.length > arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (str1[i] != arr1[i]) {
                    return str1[i] - arr1[i];
                }
                return 1;
            }
        } else if (str1.length < arr1.length) {
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] != arr1[i]) {
                    return str1[i] - arr1[i];
                }
                return -1;
            }
        } else {
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] != arr1[i]) {
                    return str1[i] - arr1[i];
                }
                return 0;
            }
        }
        return 0;
    }





    public static void main20(String[] args) {
        String str="123,456,789";
        String arr="456";
        String arr1="012";
        System.out.println(contains(str,arr));
        System.out.println(contains(str,arr1));
    }
    public static boolean contains(String str,String arr){
        char[]str1=str.toCharArray();
        char[]arr1=arr.toCharArray();
        StringBuffer str2= new StringBuffer();
        StringBuffer arr2= new StringBuffer();

        for (int i = 0; i <str.length() ; i++) {
            if(arr1[0]==str1[i]){
                for (int j = 0; j <arr.length() ; j++) {
                    str2.append(str1[i+j]);
                    arr2.append(arr1[j]);
                }
                if(str2.toString().equals(arr2.toString())){
                    return true;
                }
            }
        }
        return false;
    }






    public static void main9(String[] args) {
  String str="123,456,789";
  String arr="456";
  int result = IndexOf(str,arr);
        System.out.println(result);
    }
    public static int IndexOf(String str,String arr){
        char[]str1=str.toCharArray();
        char[]arr1=arr.toCharArray();
        StringBuffer str2= new StringBuffer();
        StringBuffer arr2= new StringBuffer();

        for (int i = 0; i <str.length() ; i++) {
         if(arr1[0]==str1[i]){
             for (int j = 0; j <arr.length() ; j++) {
                 str2.append(str1[i+j]);
                 arr2.append(arr1[j]);
             }
             if(str2.toString().equals(arr2.toString())){
                 return i;
             }
            }
        }
        return -1;
    }







    public static void main8(String[] args) {
 String str="123,123,456,123,456";
 String arr="456";
 String key="123";
 String result=Repalce(str,arr,key);
        System.out.println(result.toString());
    }
    //str原字符串，arr需要被替换的字符串，key替换成的字符串
    public static  String  Repalce(String str,String arr,String key){
        List<String> list=new ArrayList<String>();
        while (str.contains(arr)){
            int index=str.indexOf(arr);
            String temp=str.substring(0,index);
            list.add(temp);
            list.add(key);
            str=str.substring(index+arr.length());
        }
        list.add(str);
        String result="";
        for (int i = 0; i <list.size() ; i++) {
            result+=list.get(i);
        }
        return result;
    }







    public static void main7(String[] args) {
String arr="student,student,student,classes,student";
String [] result=spilt(arr,",");
        System.out.println(Arrays.toString(result));
    }
    public static String[] spilt(String str,String Separator){
        List<String> list=new ArrayList<String >();
       while (str.contains(Separator)){
           int t=str.indexOf(Separator);
           String arr=str.substring(0,t);
           list.add(arr);
           str=str.substring(t+Separator.length());
       }
        list.add(str);
       String [] arr=new String[list.size()];
        for (int j = 0; j <arr.length ; j++) {
            arr[j]=list.get(j);
        }
        return arr;
    }








    public static void main6(String[] args){

        String s;

      //  System.out.println("s="+s);

    }

    public static void main5(String[] args) {
        int []arr={5, 12, 9, 8, 61, 37, 51};
        My_toString(arr);
    }
    public static void My_toString(int arr[]){
        String str="[";
        for (int i = 0; i <arr.length ; i++) {
            if(i<arr.length-1){
                str=str+arr[i]+",";
            }else {
                str=str+arr[i]+"]";
            }
        }
        System.out.println(str);
    }





    public static void main4(String[] args) {
        int [] arr={5,12,9,8,61,37,51};
        int []arr2=My_ArrayCopy(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] My_ArrayCopy(int arr[]){
        int []arr2=new int[arr.length];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }







    public static void main3(String[] args) {
        int []arr={5, 8, 9, 12, 37, 51, 61};
        int key=37;
        int key2=21;
        Binary(arr,key);
        Binary(arr,key2);
    }
    public static void Binary(int []arr,int key){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(key==arr[mid]){
                System.out.println("第"+(mid+1)+"个数为"+key);
                return;
            }
            if(key<arr[mid]){
                right=mid-1;
            }
            if(key>arr[mid]){
                left=mid+1;
            }
        }
        System.out.println("没有找到"+key);
    }





    public static void main2(String[] args) {
        int [] arr={5,12,9,8,61,37,51};
        int []arr2={5, 8, 9, 12, 37, 51, 61};
        isSort(arr);
        isSort(arr2);
    }
    public  static  void isSort(int arr[]){
        int tag=1;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("不是升序");
                tag=0;
                return;
            }
        }
        if(tag==1){
            System.out.println("是升序");
        }
    }



    public static void main1(String[] args) {
        int [] arr={5,12,9,8,61,37,51};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int t =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
