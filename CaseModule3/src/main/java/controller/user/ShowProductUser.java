package controller.user;

import dao.product.ProductDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/showProductUser")
public class ShowProductUser extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", ProductDao.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("User/user.jsp");
        dispatcher.forward(req,resp);
    }
}
