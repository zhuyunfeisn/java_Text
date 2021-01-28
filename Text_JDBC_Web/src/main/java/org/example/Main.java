package org.example;

import org.example.JDBC.RegisterJDBC;
import org.example.JDBC.SignJDBC;
import org.example.JDBC.User;

public class Main {

    public static void main(String[] args) {
        RegisterJDBC.RegisterJDBC("小朱","1009");
    }
    public static void main2(String[] args) {

        User user=SignJDBC.SignJDBC("张三", "1001");
        if(user!=null){
            System.out.println(user.toString());
        }else {
            System.out.println("没有找到");
        }
    }
}
