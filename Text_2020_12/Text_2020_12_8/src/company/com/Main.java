package company.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n=5;
        for (int i = 1; i <=n ; i++) {
            int factorresult=1;
            int num=0;
            for (int j = 0; j <i ; j++) {
                factorresult*=i;
            }
            num+=factorresult;
        }
    }
}
