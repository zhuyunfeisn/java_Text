package company.com;

import java.util.Random;

public class ArrayCounter {
    public static Integer[] GenerageRandomArray(int n,int Bound){
        Random random=new Random();
        Integer []data=new Integer[n];
        for (int i = 0; i <data.length ; i++) {
            data[i]=random.nextInt(Bound);
        }
       return data;
    }
}
