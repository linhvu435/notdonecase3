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

@WebServlet(urlPatterns = "/createProduct")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String type = req.getParameter("type");
            String img = req.getParameter("img");
            String name = req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));
            int amount = Integer.parseInt(req.getParameter("amount"));
            Product product = new Product();
            product.setType(type);
            product.setImg(img);
            product.setName(name);
            product.setPrice(price);
            product.setAmount(amount);
            ProductDao.save(product);
            resp.sendRedirect("/productServlet");
    }
}
