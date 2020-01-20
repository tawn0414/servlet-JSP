package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "memRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO read = dao.read(id);
		
		request.setAttribute("read", read);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/memb_read.jsp");
		rd.forward(request, response);
	}

}
