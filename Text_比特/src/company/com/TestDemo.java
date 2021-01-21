package company.com;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7};
        int [] arr2={8,9,10,11};
        int t=arr1.length-arr2.length;
        if(t>=0){
            int []temp=new int[arr1.length-1];
            for (int i = 0; i <arr1.length-1 ; i++) {
                temp[i]=arr1[i];
            }
            arr1=arr2;
            arr2=temp;

        }else {
            int []temp=new int[arr2.length-1];
            for (int i = 0; i <arr2.length-1 ; i++) {
                temp[i]=arr2[i];
            }
            arr2=arr1;
            arr1=temp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }









    public static void swap(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }

    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 9, 8, 7};
        swap(array);
        System.out.println(Arrays.toString(array));

    }
}