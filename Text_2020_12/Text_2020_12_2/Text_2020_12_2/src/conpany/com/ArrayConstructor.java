package conpany.com;

import java.util.Random;

public class ArrayConstructor {
    private ArrayConstructor() {
    }
    public  static Integer[] GenerageOredeArray(int n){
        Integer []data=new Integer[n];
        for (int i = 0; i <data.length ; i++) {
            data[i]=i;
        }
        return data;
    }
    public  static Integer[] GenerageRandomArray(int n,int Bound){
        Random random=new Random();
        Integer []data=new Integer[n];
        for (int i = 0; i <n ; i++) {
            data[i]=random.nextInt(Bound);
        }
        return data;
    }
}
