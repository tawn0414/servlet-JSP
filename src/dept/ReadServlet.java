package dept;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptread", urlPatterns = { "/dept/read.do" })
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr"); //POST방식에서만 적용이 됨.
		response.setContentType("text/html;charset=euc-kr");
		//1. 요청정보추출 -> 클라이언트가 직접 폼태그에 작성한 내용이나 필요에 의해서 넘긴 파라미터를 추출(여기서는 deptno)
		//		- 기본설정인 경우 POST방식에서만 적용, get방식인 경우 적용하려면
		//		  server.xml의 설정을 변경한다.
		String deptno = request.getParameter("deptno");
		String info = request.getParameter("info");
		System.out.println("한글정보 추출:"+info);
		//2. 비즈니스 메소드 호출 -> DeptDAO클래스에 메소드 추가하고 호출하기
		DeptDAO dao = new DeptDAO();
		DeptDTO dept = dao.read(deptno);
		
		//3. jsp로 넘겨 줄 데이터 공유하기
		request.setAttribute("deptInfo", dept);
		
		//4. 요청재지정(forward) - 응답할 jsp요청하기
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}
