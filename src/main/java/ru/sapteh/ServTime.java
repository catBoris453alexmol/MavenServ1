package ru.sapteh;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet (name ="<h1> ServerTime", urlPatterns ={"/ServerTime"})
public class ServTime extends HttpServlet {
    public static final long serialVersionUID=1l;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("<ServerTime>");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.printf("<h1>Server time: %tT</h1>", new Date());
        out.println("</body>");
        out.println("</html>");
    }
}
