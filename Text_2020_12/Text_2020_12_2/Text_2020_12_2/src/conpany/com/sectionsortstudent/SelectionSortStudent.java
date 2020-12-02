package conpany.com.sectionsortstudent;

public class SelectionSortStudent {
    private SelectionSortStudent(){};
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

    public static void main7(String[] args) {
        Student []students=new Student[]{
                new Student("bobo",85),
                new Student("nannan",100),
                new Student("feifei",92)
        };
        SelectionSortStudent.sort(students);
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].toString());
        }
    }
}
