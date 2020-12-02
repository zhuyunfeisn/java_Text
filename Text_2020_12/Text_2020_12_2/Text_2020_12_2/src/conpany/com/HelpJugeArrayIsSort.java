package conpany.com;

public class HelpJugeArrayIsSort {
    private HelpJugeArrayIsSort(){};
    public static <E extends Comparable<E>> boolean issort(E []data){
        for (int i = 1; i <data.length ; i++) {
            if(data[i-1].compareTo(data[i])>0){
                return false;
            }
        }
        return true;
    }
    public static <E extends Comparable<E>> void Testsort(String sortname,E []data){
        long starttime=System.nanoTime();
        if(sortname.equals("SelectionSrotE")){
            SelectionSortE.sort(data);
        }
        long endtime=System.nanoTime();
        double time=endtime-starttime;
        if(!HelpJugeArrayIsSort.issort(data)){
            throw  new  RuntimeException(sortname+"is failed");
        }
        System.out.println(time);
    }
}
