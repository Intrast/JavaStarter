package xlist.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Створює, відображає і видаліє замітку
 */
@WebServlet(name = "ListServlet", value = {"/list/*"})
public class ListServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(ListServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        switch (request.getPathInfo()) {
            case "/all-list":
                out.write("<H1>All List</H1>");
                out.println("<button type=\"button\" class=\"btn btn-primary\">Підготовлена</button>");
                break;
            case "/view-note":
                out.write("<H1>Hello Note!</H1>");
                out.println("<button type=\"button\" class=\"btn btn-primary\">Підготовлена</button>");
                break;
        }
    }
}
