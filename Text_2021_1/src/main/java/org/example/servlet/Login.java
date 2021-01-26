package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//注解的使用：小括号包裹多个属性，属性名=属性值，多个之间逗号间隔
//属性名位value时可以缺省
//Servlet定义服务，注意服务路径必须是/开始，否则tomcat启动就会报错
@WebServlet("/login")//服务路径
public class Login extends HttpServlet {

    /**
     *每次http请求 映射到某个Servlet的资源路径，都会调用service生命周期方法
     *如果请求方法没有重写，就会调用父类的doMethod（对应请求方法），返回405
     * 如果重写，会将请求数据包装为 ，Request对象，这时候虽然没有响应，但是也保障了一个Response响应对象
     *
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如果使用父类的doPost方法，父类方法里面逻辑会抛405或者400
        // super.doPost(req, resp);

        //设置请求，响应编码，以及响应数据类型（为响应体设置ContenType）
        req.setCharacterEncoding("UTF-8");//设置请求体编码
        resp.setCharacterEncoding("UTF-8");//设置请求体的编码
        resp.setContentType("text/html");//为响应体设置ContenType

        //解析请求数据（不一定有）
        //request.getParameter方法获取请求的数据：url和请求体，数据格式为k1=v1&k2=v2
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.printf("用户名（%s），密码（%s）\n",username,password);
        // 返回响应的数据
        PrintWriter Rpassword=resp.getWriter();//response获取io输出流
        Rpassword.println("登录成功");
        Rpassword.println("<h3>欢迎你, "+username+"</h3>");
        Rpassword.flush();//有缓冲的io操作，需要刷新缓冲区，才会真正发送和接收数据
        Rpassword.close();//io流操作一定要记住关闭资源
    }
}
