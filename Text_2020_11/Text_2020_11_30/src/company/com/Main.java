package company.com;

public class Main {
    public static void main(String[] args) {
        String str1="12536225";
        char []ar=str1.toCharArray();
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]<'1'||ar[i]>'9'){
                System.out.println("不是全为数字");
                return;
            }
        }
        System.out.println("全为数字");
    }
}
