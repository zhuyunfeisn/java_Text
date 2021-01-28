package org.example.servlet;

import org.example.JDBC.SignJDBC;
import org.example.JDBC.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sign")
public class SignServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        User user= SignJDBC.SignJDBC(username, password);
        PrintWriter Rpassword=resp.getWriter();
        if(user!=null){
            //获取session信息（从客户端获取jsessionid，从服务端获取session对象），参数为false：如果获取不到，返回null
            //参数为true,如果获取不到，创建一个（服务端创建），再返回
            HttpSession session=req.getSession();//无参默认是true
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            //真实操作时，可以查询数据库用户信息，转化为一个用户对象
            // session.setAttribute(user, user);
            Rpassword.println("<h1>登录成功</h1>\n");
            Rpassword.println("<h2>欢迎你"+username+"</h1>\n");
        }else {
            Rpassword.println("<h1>登录失败，账号或密码错误");
        }
        Rpassword.flush();
        Rpassword.close();
    }
}
