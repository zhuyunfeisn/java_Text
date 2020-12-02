package company.com;
//第二种选择排序，从后往前
public class SelectionSort {

    private SelectionSort(){};

    public static void swap(int []data,int minIndex,int i){
        int temp=data[minIndex];
        data[minIndex]=data[i];
        data[i]=temp;
    }
    public static void sort(int []data){
        for (int i = data.length-1; i >-1 ; i--) {
            int maxIndex = i;
            for (int j = i; j > -1; j--) {
                if (data[maxIndex] < data[j]) {
                    maxIndex = j;
                }
            }
            SelectionSort.swap(data,maxIndex,i);
        }
        for (int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
