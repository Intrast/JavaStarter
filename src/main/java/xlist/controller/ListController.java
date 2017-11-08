package xlist.controller;

import xlist.view.IndexView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListController", urlPatterns = {"/"})
public class ListController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        IndexView indexView = new IndexView();
        indexView.outTopPage(out);
        indexView.outMenu(out);
        out.write("<div class=\"container-fluid\">");
        out.write("<H1>Hello Servlet World!</H1>");
        out.println("<button type=\"button\" class=\"btn btn-primary\">Підготовлена</button>");
        out.write("</div>");
        indexView.outBottomPage(out);
    }
}
