package dept;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> arrdao = dao.getDeptList();
		int size = arrdao.size();
		
		request.setAttribute("arrlist", arrdao);
		request.setAttribute("size", size);
		
		RequestDispatcher rd = request.getRequestDispatcher("/dept/list.jsp");
		rd.forward(request, response);
		
	}
}