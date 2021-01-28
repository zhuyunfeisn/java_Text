package org.example.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignJDBC {
    public static User SignJDBC(String username,String password) {
        String sql="select id,username,password from user where username=? and password=?";
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            DataSource ds=new MysqlDataSource();
            ( (MysqlDataSource)ds).setUrl( ("jdbc:mysql://localhost:3306/javaweb?user=root" +
                    "&password=sn20000904&useUnicode=true&characterEncoding=UTF-8"));
          connection=((MysqlDataSource)ds).getConnection();
             statement=connection.prepareStatement(sql);
             statement.setString(1, username);
             statement.setString(2, password);
           resultSet=statement.executeQuery();
            while ((resultSet.next())){
                int id=resultSet.getInt("id");
                String username1=resultSet.getString("username");
                String password1=resultSet.getString("password");
                User user=new User(id,username,password );
                return user;
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("查询信息错误",throwables);
        } finally {
            try {
                if(resultSet!=null)
                    resultSet.close();
                if(statement!=null)
                    statement.close();
                if(connection!=null)
                    connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
   return null;
    }
}
