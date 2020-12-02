package company.com;

public class HelpJugeArrayIsSort {
    private HelpJugeArrayIsSort(){};
   public static <E extends Comparable<E>> boolean isSort(E []data){
       for (int i = 1; i <data.length ; i++) {
           if(data[i-1].compareTo(data[i])>0){
               return false;
           }
       }
       return true;
   }


   public static <E extends Comparable<E>> void Textsort(E []data,String sortname){
       if(!sortname.equals("SelectionSortE")){
           throw new RuntimeException("Run error");
       }
       long starttime=System.nanoTime();
       SelectionSortE.sort(data);
       long endtime=System.nanoTime();
       double time=(endtime-starttime)/1000000000.0;
       System.out.println(time);
   }
}
