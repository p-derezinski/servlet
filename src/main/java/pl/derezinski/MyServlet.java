package pl.derezinski;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String anotherName = req.getParameter("anotherName");
        out.println("Hello World from maven! :) :) :D   -   " + name + "  -  " + anotherName);

        Cookie cookie = new Cookie("", "");
        resp.addCookie(cookie);

//        resp.sendRedirect(req.getContextPath() + "/hello2");
//        getServletContext().getRequestDispatcher("/hello2").forward(req, resp);
//        getServletContext().getRequestDispatcher("/hello2").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello World from post!");
    }
}
