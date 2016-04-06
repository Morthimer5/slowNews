package controller;

import DAO.InitNews;
import DAO.NewsContainer;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ArchiveServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Archive.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("<" + req.getParameter("newsId") + ">");
        int newsId = Integer.parseInt(req.getParameter("newsId"));
        User user = (User)(req.getSession().getAttribute("user"));
        if(req.getParameter("remove").equals("true")){
            user.removeNews(NewsContainer.getNewsById(newsId));
        }else {
            user.addNews(NewsContainer.getNewsById(newsId));
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Archive.jsp");
        dispatcher.forward(req, resp);
    }
}
