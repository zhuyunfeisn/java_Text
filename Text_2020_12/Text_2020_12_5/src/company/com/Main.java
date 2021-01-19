package company.com;

public class Main {
    public static void main(String[] args) {
     Integer arr1[]=ArrayGenerator.arrayRondom(10000);
     Integer arr2[]=ArrayGenerator.arrayRondom(100000);
     Integer arr3[]=ArrayGenerator.arraygeneratorReverse(10000);
    Integer arr4[]=ArrayGenerator.arraygeneratorReverse(100000);
     long starttime1=System.nanoTime();
     InsertionSort.Sort(arr1);
     long starttime2=System.nanoTime();
        System.out.println((starttime2-starttime1)/1000000000.0+"s");
        InsertionSort.Sort(arr2);
        long starttime3=System.nanoTime();
        System.out.println((starttime3-starttime2)/1000000000.0+"s");
        InsertionSort.Sort(arr3);
        long starttime4=System.nanoTime();
        System.out.println((starttime4-starttime3)/1000000000.0+"s");
        InsertionSort.Sort(arr4);
        long endtime=System.nanoTime();
        System.out.println((endtime-starttime4)/1000000000.0+"s");
    }
}
