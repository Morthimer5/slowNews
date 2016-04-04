package controller;

import DAO.UsersContainer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Morthimer on 3/30/2016.
 */
public class ShowAllUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", UsersContainer.getUsers());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/Users.jsp");
        dispatcher.forward(req, resp);
    }
}
