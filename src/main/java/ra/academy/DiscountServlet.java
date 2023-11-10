package ra.academy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String des = request.getParameter("productDescription");
        double price = Double.parseDouble(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <p>Product Description : "+des+" </p>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <p>List Price : "+price+" </p>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <p>Discount Percent : "+discountPercent+"</p>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <p>Discount Amount : "+(price * discountPercent * 0.01)+"</p>\n" +
                "    </div>\n" +
                "    <div>\n" +
                "        <p>Discount Price : "+(price - (price * discountPercent * 0.01))+"</p>\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }
}