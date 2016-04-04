package controller;

import DAO.UsersContainer;
import model.News;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegistrationServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Registration.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(UsersContainer.getUsers().containsKey(req.getParameter("login"))){
            req.setAttribute("regreport", "occupied");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/RegistrationReport.jsp");
            dispatcher.forward(req, resp);
            return;
        }else if(!req.getParameter("password").equals(req.getParameter("confirmPassword"))){
            req.setAttribute("regreport", "Pass");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/RegistrationReport.jsp");
            dispatcher.forward(req, resp);
            return;
        }else if(req.getParameter("name").equals("") || req.getParameter("login").equals("") || req.getParameter("mail").equals("") || req.getParameter("login").equals("password")){
            req.setAttribute("regreport", "emptyField");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/RegistrationReport.jsp");
            dispatcher.forward(req, resp);
            return;
        }else {
            UsersContainer.setUser(req.getParameter("login"), new User(req.getParameter("name"), req.getParameter("login"),
                    req.getParameter("mail"), req.getParameter("password"), new HashMap<String, News>()));

            req.setAttribute("regreport", "Ok");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/RegistrationReport.jsp");
            req.getSession().setAttribute("user", UsersContainer.getUser(req.getParameter("login")));
            dispatcher.forward(req, resp);
        }
    }
}