package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//1. ��û���� �����ϱ�.
		req.setCharacterEncoding("euc-kr"); //���̵� �ѱ�ġ�� �ֿܼ� ������ �����ϱ� �̷��� ���༭ �ѱ۵� �����ϰ� ������.
		String id = req.getParameter("id"); //"id"�� "pass"�� test.html�� �ִ� name��
		String pass = req.getParameter("pass");

		System.out.println("���̵�:"+id);
		System.out.println("�н�����:"+pass);
	}

}

