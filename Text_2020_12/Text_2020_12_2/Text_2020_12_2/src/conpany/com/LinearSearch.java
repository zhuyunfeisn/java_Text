package conpany.com;

public class LinearSearch {
    public  static <E> int search(E []data,E target){
        for (int i = 0; i <data.length ; i++) {
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main4(String[] args) {
        Integer []data={1,55,32,41,985,214,756,325,642};
        int n=data.length;
        for (int i = 0; i <n-1; i++) {
            int min=data[i];
            int mincount=0;
            int temp=0;
            for (int j = i; j <n-1-i ; j++) {
                if(data[j]<min){
                    min=data[j];
                    mincount=j;
                }
              temp=data[i];
                data[i]=data[j];
                data[j]=temp;
            }
        }
     for (int k=0;k<n;++k){
         System.out.println(data[k]);
     }
    }
    public static void main3(String[] args) {
        int []data={1000000,10000000};
        for(int i=0;i<data.length;++i){
            int n=data[i];
            Integer []data2=ArrayConstructor.GenerageOredeArray(n);
            long starttime=System.nanoTime();
            for (int j=0;j<100;++j)
            LinearSearch.search(data2,n);
            long endtime=System.nanoTime();
            double time=(endtime-starttime)/1000000000.0;
            System.out.println("search:"+n+"time="+time+"count=100");
        }
    }
    public static void main2(String[] args) {
        int []data2={100000,1000000};
        for(int i=0;i<2;i++) {
            int n=data2[i];
            Integer[] data = ArrayConstructor.GenerageOredeArray(n);
            long starttime = System.nanoTime();
            for (int j = 0; j <100 ; j++) {
                LinearSearch.search(data, n);
            }
            long endtime = System.nanoTime();
            double time = (endtime - starttime) / 1000000000.0;
            System.out.println(time);
        }
    }



    public static void main1(String[] args) {
        Integer []data=new Integer[]{1,2,3,55,99,86,41};
        int src1=LinearSearch.search(data,99);
        System.out.println(src1);
        int src2=LinearSearch.search(data,954);
        System.out.println(src2);
        Student []students=new Student[]{
                new Student("bobo"),
                new Student("nannan"),
                new Student("feifei")
        };
        Student student=new Student("nannan");
        int src3=LinearSearch.search(students,student);
        System.out.println(src3);
    }
}
