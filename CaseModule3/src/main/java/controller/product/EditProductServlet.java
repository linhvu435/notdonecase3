package controller.product;

import dao.product.ProductDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.util.HashMap;

@WebServlet(urlPatterns = "/editProduct")
public class EditProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (Product p : ProductDao.getAll()
        ) {
            if (p.getId() == id) {
                req.setAttribute("p", p);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("Product/EditProduct.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String type = req.getParameter("type");
        String img = req.getParameter("img");
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        int amount = Integer.parseInt(req.getParameter("amount"));
        ProductDao.UpdateProduct(new Product(id,type,img,name,price,amount));
        resp.sendRedirect("/productServlet");

    }
}