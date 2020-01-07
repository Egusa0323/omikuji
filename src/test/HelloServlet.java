package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String name = "バティスタ";
        int number = (int)(Math.random() * 5);
        System.out.println(name);
        System.out.println(number);
        request.setAttribute("my_name", name);
        request.setAttribute("my_age", number);
        request.getRequestDispatcher("test.jsp").forward(request, response);
        //PrintWriter out = response.getWriter();
        //out.println("<html>");
        //out.println("<head>");
        //out.println("<title>はじめてのサーブレット</title>");
        //out.println("</head>");
        //out.println("<body>");
        //out.println("こんにちは、サーブレットの世界へ！！");
        //out.println("</body>");
        //out.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
