package pxu.edu.vn.bai03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		 // Lấy giá trị tên đăng nhập và mật khẩu từ yêu cầu đăng nhập
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");

	    // Kiểm tra tên đăng nhập và mật khẩu
	    if (username.equals("admin") && password.equals("12345678")) {
	      // Đăng nhập thành công, chuyển hướng đến trang chính
	      response.sendRedirect("homelogin.html");
	    } else {
	      // Đăng nhập thất bại, chuyển hướng đến trang thông báo lỗi
	      response.sendRedirect("errol.html");
	}
	}
}
