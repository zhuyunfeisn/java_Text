package company.com;

public class InsertionSort {
    private InsertionSort(){};
    public static <E> void swap(E []arr,int j,int i){
        E temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static <E extends Comparable<E>> void Sort(E []arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j-1>=0 ; j--) {
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }
            }
        }
    }
}
