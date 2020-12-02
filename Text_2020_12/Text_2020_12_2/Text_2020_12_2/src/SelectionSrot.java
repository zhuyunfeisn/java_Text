public class SelectionSrot {
    private  SelectionSrot(){};
    public static void swap(int []arr,int minIndex,int i){
        int temp=0;
        temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
    }
    public static void Sort(int []data){
        for (int i = 0; i <data.length ; i++) {
            int minIndex=i;
            for (int j = i; j <data.length; j++) {
                if (data[j]<data[minIndex]){
                    minIndex=j;
                }
            }
            swap(data,minIndex,i);
        }
    }



    /*public static void Sort(int []arr){
             for (int i=0;i<arr.length;++i){
                 int minIndex=i;
                 for (int j=i;j<arr.length;j++){
                     if(arr[j]<arr[minIndex]){
                         minIndex=j;
                     }
                 }
                 swap(arr,minIndex,i);
             }
    }
*/
    public static void main5(String[] args) {
        int []data={1,22,54,13,20,12,55,987,541,236,15,17,14,32};
        SelectionSrot.Sort(data);
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }
}
