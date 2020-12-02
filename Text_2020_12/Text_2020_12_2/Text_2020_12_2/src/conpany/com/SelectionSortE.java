package conpany.com;

//使用泛型比较
public class SelectionSortE {
    private SelectionSortE(){};
    public static <E extends Comparable<E>> void sort(E []data){
        for (int i = 0; i <data.length ; i++) {
           int minIndex=i;
            for (int j = i; j <data.length ; j++) {
                if(data[j].compareTo(data[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(data,i,minIndex);
        }
    }

    public static <E> void swap(E []data,int i,int minIndex){
        E temp=data[i];
        data[i]=data[minIndex];
        data[minIndex]=temp;
    }

    public static void main(String[] args) {
        int []n={10000,100000};
        for (int i=0;i<n.length;i++){
            Integer []data=ArrayConstructor.GenerageRandomArray(n[i],n[i]);
          HelpJugeArrayIsSort.Testsort("SelectionSortE",data);
        }
    }
}
