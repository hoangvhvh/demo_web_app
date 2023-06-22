package pxu.edu.vn.bai03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteringAccount
 */
@WebServlet("/RegisteringAccount")
public class RegisteringAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteringAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   	 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String firstName = request.getParameter("first-name");
	        String lastName = request.getParameter("last-name");
	        String dob = request.getParameter("dob");
	        String gender = request.getParameter("gender");
	        String email = request.getParameter("email");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Kết quả</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Thông tin bạn đã đăng ký như sau:</h1>");
	        out.println("<p>Họ: " + firstName + "</p>");
	        out.println("<p>Tên: " + lastName + "</p>");
	        out.println("<p>Ngày sinh: " + dob + "</p>");
	        out.println("<p>Giới tính: " + gender + "</p>");
	        out.println("<p>Địa chỉ email: " + email + "</p>");
	        out.println("<p>Tên tài khoản: " + username + "</p>");
	        out.println("<p>Mật khẩu: " + password + "</p>");
	        out.println("</body>");
	        out.println("</html>");
	}

}
