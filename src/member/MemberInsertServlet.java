package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "memInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String deptno = request.getParameter("deptno");
		String hiredate = request.getParameter("hiredate");
		int point =Integer.parseInt(request.getParameter("point"));

		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO(id, pass, name, addr, deptno, hiredate, point);
		int result = dao.insert(member);
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/InsertResult.jsp");
		rd.forward(request, response);
	}

}
