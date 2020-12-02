package conpany.com;

public class SelectionSortEE {
    private SelectionSortEE(){};
    public static  <E> void swap(E []data,int i,int minIndex){
        E temp=data[i];
        data[i]=data[minIndex];
        data[minIndex]=temp;
    }

    public  static <E extends Comparable<E>> void  sort(E []data){
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

    public static void main6(String[] args) {
        Double [] data={10.712,25.124,2.145,985.23,11.23,6.1,548972.123698};
        SelectionSortEE.sort(data);

        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }
}
