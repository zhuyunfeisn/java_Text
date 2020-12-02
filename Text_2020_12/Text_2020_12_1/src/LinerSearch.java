public class LinerSearch {

    public static <E> int search(E []data,E target){
        for (int i = 0; i <data.length ; i++) {
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
 Integer []data={1,5,62,54,12,66};
 int src1=LinerSearch.search(data,62);
        System.out.println(src1);
        int src2=LinerSearch.search(data,666);
        System.out.println(src2);
            Student []students=new Student[]{
                    new Student("Bobo"),
                    new Student("xiaohong"),
                    new Student("nannan")
            };
            Student bobo=new Student("Bobo");
            int src3=LinerSearch.search(students,bobo);
            System.out.println(src3);
    }
}
