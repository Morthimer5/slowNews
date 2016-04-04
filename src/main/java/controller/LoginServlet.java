package controller;

import DAO.UsersContainer;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getSession().getAttribute("Login e-mail");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Написать
        String login = req.getParameter("login");
        if(UsersContainer.getUsers().containsKey(login)){
            if(((String)UsersContainer.getUsers().get(login).getPassword()).equals(req.getParameter("password"))){

                req.setAttribute("logreport", "ok");
                req.getSession().setAttribute("user", UsersContainer.getUsers().get(login));
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/LoginReport.jsp");
                dispatcher.forward(req, resp);
            }else{
                req.setAttribute("logreport", "pass");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/LoginReport.jsp");
                dispatcher.forward(req, resp);
            }
        }else{

            req.setAttribute("logreport", "login");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/LoginReport.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
