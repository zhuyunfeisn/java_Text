package company.com;

public class SelectionSortE {
    private SelectionSortE(){};

    public static <E> void swap(E []data,int maxIndex,int i){
        E temp=data[maxIndex];
        data[maxIndex]=data[i];
        data[i]=temp;
    }

    public static <E extends Comparable<E>> void sort(E []data){
        for (int i = data.length-1; i >-1 ; i--) {
            int maxIndex=i;
            for (int j = i; j >-1 ; j--) {
                if(data[maxIndex].compareTo(data[j])<0){
                    maxIndex=j;
                }
            }
            SelectionSortE.swap(data,maxIndex,i);
        }
    }
}
