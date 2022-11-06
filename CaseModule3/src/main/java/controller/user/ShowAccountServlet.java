package controller.user;

import dao.user.AccountDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/showAccount")
public class ShowAccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("showAccount", AccountDao.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("User/ShowAccount.jsp");
        dispatcher.forward(req,resp);
    }
}
