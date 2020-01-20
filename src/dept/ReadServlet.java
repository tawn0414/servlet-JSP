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
		
		request.setCharacterEncoding("euc-kr"); //POST��Ŀ����� ������ ��.
		response.setContentType("text/html;charset=euc-kr");
		//1. ��û�������� -> Ŭ���̾�Ʈ�� ���� ���±׿� �ۼ��� �����̳� �ʿ信 ���ؼ� �ѱ� �Ķ���͸� ����(���⼭�� deptno)
		//		- �⺻������ ��� POST��Ŀ����� ����, get����� ��� �����Ϸ���
		//		  server.xml�� ������ �����Ѵ�.
		String deptno = request.getParameter("deptno");
		String info = request.getParameter("info");
		System.out.println("�ѱ����� ����:"+info);
		//2. ����Ͻ� �޼ҵ� ȣ�� -> DeptDAOŬ������ �޼ҵ� �߰��ϰ� ȣ���ϱ�
		DeptDAO dao = new DeptDAO();
		DeptDTO dept = dao.read(deptno);
		
		//3. jsp�� �Ѱ� �� ������ �����ϱ�
		request.setAttribute("deptInfo", dept);
		
		//4. ��û������(forward) - ������ jsp��û�ϱ�
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}
