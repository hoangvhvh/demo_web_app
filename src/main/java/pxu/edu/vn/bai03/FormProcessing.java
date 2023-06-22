package pxu.edu.vn.bai03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormProcessing
 */
@WebServlet("/FormProcessing")
public class FormProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormProcessing() {
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
		response.setContentType("text/html; charset=UTF-8");
		  PrintWriter out = response.getWriter();
	        
	        String textFieldValue = request.getParameter("text-field");
	        String hiddenFieldValue = request.getParameter("hidden-field");
	        String checkBoxValue = request.getParameter("check-box");
	        String listBoxValue = request.getParameter("list-box");
	        String radioButtonValue = request.getParameter("radio-button");
	        
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Giá trị Form</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>In ra thông tin của Form như sau:</h1>");
	        out.println("<p>Text Field: " + textFieldValue + "</p>");
	        out.println("<p>Hidden Field: " + hiddenFieldValue + "</p>");
	        out.println("<p>Check Box: " + checkBoxValue + "</p>");
	        out.println("<p>List Box: " + listBoxValue + "</p>");
	        out.println("<p>Radio Button: " + radioButtonValue + "</p>");
	        out.println("</body>");
	        out.println("</html>");
	}

}
