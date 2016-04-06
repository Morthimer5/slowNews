package controller;

import DAO.InitNews;
import DAO.NewsContainer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("user", "Guest");
        req.setAttribute("newslist", NewsContainer.getNews());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/Allnews.jsp");
        dispatcher.forward(req, resp);
    }
}
