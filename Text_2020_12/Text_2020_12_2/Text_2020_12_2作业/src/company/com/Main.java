package company.com;

public class Main {


    public static void main(String[] args) {
        Integer []data=ArrayCounter.GenerageRandomArray(10000,10000);
        SelectionSortE.sort(data);

       if(HelpJugeArrayIsSort.isSort(data)){
            HelpJugeArrayIsSort.Textsort(data,"SelectionSortE");
        }
    }


    public static void main2(String[] args) {
        Student []students=new Student[]{
                new Student("bobo",85),
                new Student("nannan",98),
                new Student("feifie",91),
                new Student("zhangsan",68)
        };
        SelectionSortE.sort(students);
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].toString());
        }
    }


    public static void main1(String[] args) {
        int []data=new int[]{1,2,55,21,98,54,215,30,682};
        SelectionSort.sort(data);
    }
}
