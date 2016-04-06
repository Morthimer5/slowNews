package controller;

import DAO.InitNews;
import DAO.NewsContainer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AllNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("newsMap", NewsContainer.getNews());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Allnews.jsp");
        dispatcher.forward(req, resp);
    }
}
