package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OmikujiServlet
 */
@WebServlet("/OmikujiServlet")
public class OmikujiServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OmikujiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html; charset=UTF-8");
        //request.setCharacterEncoding("UTF-8");
        System.out.println("サーブレットが呼ばれた");
        String my_name = request.getParameter("my_name");
        System.out.println(my_name);
        // 入力項目チェック（バリデーション）
        List<String> errors = new ArrayList<String>();
        //このあたりにif文で条件分岐　名前が入ってないときと表示　※名前が入ってるときは下記の通り
        if(my_name == null || my_name.equals("") == true){
            errors.add("氏名を入力してください");

        }
        if(errors.size() > 0){
            request.setAttribute("errors", errors);
        }
        else{
          //占いをする
            String[] omikuji_results = {"大吉", "吉", "中吉", "小吉", "末吉", "凶"};
            String fortune = omikuji_results[(int)(Math.random() * 6)];
            request.setAttribute("my_name", my_name);
            request.setAttribute("my_fortune", fortune);

        }
        request.getRequestDispatcher("/WEB-INF/omikuji_result.jsp").forward(request, response);

    }

}
