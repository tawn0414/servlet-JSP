package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDTO;

@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>forward화면 </h1>");
		
		//1.데이터 공유 - request공유
		DeptDTO dept = new DeptDTO("001", "전산실", "", "", "");
		request.setAttribute("mydata", dept);
		System.out.println("ForwardServlet실행완료");
		
		//2. 요청재지정 - Forward
		RequestDispatcher rd = request.getRequestDispatcher("/jspbasic/subPage.jsp");
		rd.forward(request, response); //forward시킬 때 request를 넘겨주니까 공유가 안될 수가 없다.
	}
}
