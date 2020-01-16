package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc", urlPatterns = { "/calc.do" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset = euc-kr");
		PrintWriter pw = response.getWriter();
		//1. ��û���� ����
		int num1= Integer.parseInt(request.getParameter("num1"));
		String method= request.getParameter("method");
		int num2= Integer.parseInt(request.getParameter("num2"));
		//2. ����Ͻ��޼ҵ� ȣ��
		CalcLogic logic = new CalcLogic();
		int result= logic.calc(num1, method, num2);
		

		pw.print("<h1>�����("+method+")</h1>");
		pw.print("------------------------");
		pw.print("<h3>num1�� "+num1+"�� num2��"+num2+"�� ������ �����"+result+"</h3>");
		
	}

}
