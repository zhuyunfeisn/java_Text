package org.example.JDBC;



import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterJDBC {
public static int  RegisterJDBC(String username,String password)  {
    Connection connection=null;
    PreparedStatement statement=null;
    String sql="insert into user(username,password) values\n" +
            "(?,?);";
    try {
        DataSource ds=new MysqlDataSource();
        ((MysqlDataSource)ds).setUrl("jdbc:mysql://localhost:3306/javaweb?user=root" +
                "&password=sn20000904&useUnicode=true&characterEncoding=UTF-8");
        connection=((MysqlDataSource)ds).getConnection();
        statement=connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        int result=statement.executeUpdate();
        return result;
    } catch (Exception throwables) {
        throwables.printStackTrace();
        throw new RuntimeException("注册失败",throwables);
    } finally {
        try {
            if(statement!=null)
                statement.close();
            if(connection!=null)
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
}
