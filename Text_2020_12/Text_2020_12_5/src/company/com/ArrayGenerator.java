package company.com;


import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator(){};
    public static Integer [] arraygeneratorReverse(int n){
        Integer []arr=new Integer[n];
        for (int i = 0;i<n;i++) {
            arr[i]=n-i-1;
        }
        return arr;
    }

    public static Integer[]arrayRondom(int n){
        Integer []arr=new Integer[n];
        Random random=new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt();
        }
        return arr;
    }
}
