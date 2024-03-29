package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id =Integer.parseInt(request.getParameter("bookId"));
		Book b = new BookDAO().searchBook(id);

		
		
		HttpSession session=request.getSession();
		session.setAttribute("BookDetails",b);
		response.sendRedirect("SearchBook.jsp");
	}


}
