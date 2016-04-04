package controller.filter;




import DAO.UsersContainer;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //NON
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        if(session.getAttribute("user") == null) {
            session.setAttribute("user", "Guest");
        }



        System.out.println("Request from " + req.getRemoteAddr()
                + "; Requested path: " + req.getServletPath()
                + "; Method: " + req.getMethod()
                + "; User: " + req.getSession().getAttribute("user")
                + "; Session: " + req.getSession());


        filterChain.doFilter(servletRequest, servletResponse);
    }



    @Override
    public void destroy() {
        //NON
    }
}
