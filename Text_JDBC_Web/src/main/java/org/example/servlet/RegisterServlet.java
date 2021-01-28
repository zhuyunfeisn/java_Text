package org.example.servlet;

import org.example.JDBC.RegisterJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")//服务路径（注册）
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        //解析请求数据（不一定有）
        //request.getParameter方法获取请求的数据：url和请求体，数据格式为k1=v1&k2=v2
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        int result= RegisterJDBC.RegisterJDBC(username, password);
        PrintWriter Rpassword=resp.getWriter();
        if(result==1){
            Rpassword.println("<h1>注册成功</h1>\n");
            Rpassword.println("<h1>恭喜你"+username+"<h1>");
        }else {
            Rpassword.println("注册失败");
        }
        Rpassword.flush();
        Rpassword.close();
    }
}
