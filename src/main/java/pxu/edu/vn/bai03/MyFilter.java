package pxu.edu.vn.bai03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFilter
 */
@WebServlet("/MyFilter")
public class MyFilter implements Filter{
	private static final long serialVersionUID = 1L;
    
	public void init(FilterConfig arg0) throws ServletException {}  
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFilter() {
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
		doGet(request, response);
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 PrintWriter out = arg1.getWriter();  
         
		    String password= arg0.getParameter("password");  
		    if(password.equals("admin")){  
		    arg2.doFilter(arg0, arg1);//sends request to next resource  
		    }  
		    else{  
		    out.print("username or password error!");  
		    RequestDispatcher rd=arg0.getRequestDispatcher("index.html");  
		    rd.include(arg0, arg1);  
	}
	}
	  public void destroy() {}  
}
	
