package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
		PrintWriter pw = response.getWriter();
		
		//비즈니스메소드 호출
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> arrdao = dao.getDeptList();
		//응답메시지 생성
		int size = arrdao.size();
		
		pw.print("<h1>부서목록</h1>");
		pw.print("<hr/>");
		pw.print("<table border=1>");
		pw.print("<tr>");
		pw.print("<th>부서코드</th>");
		pw.print("<th>부서이름</th>");
		pw.print("<th>전화번호</th>");
		pw.print("<th>부서위치</th>");
		pw.print("<th>관리자</th>");
		pw.print("<th>삭제</th>");
		pw.print("</tr>");
		for(int i = 0;i<size;i++) {
			DeptDTO dept = arrdao.get(i);
			pw.print("<tr>");
				pw.print("<td>"+dept.getDeptno()+"</td>");
				pw.print("<td>"+dept.getDeptName()+"</td>");
				pw.print("<td>"+dept.getTel()+"</td>");
				pw.print("<td>"+dept.getLoc()+"</td>");
				pw.print("<td>"+dept.getMgr()+"</td>");
				pw.print("<td><a href='/serverweb/dept/delete.do?deptno="+dept.getDeptno()+"&info=test'>삭제</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");		
	}
}
