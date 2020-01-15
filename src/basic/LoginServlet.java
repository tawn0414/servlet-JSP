package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//1. 요청정보 추출하기.
		req.setCharacterEncoding("euc-kr"); //아이디에 한글치면 콘솔에 깨져서 나오니까 이렇게 해줘서 한글도 가능하게 해주자.
		String id = req.getParameter("id"); //"id"랑 "pass"는 test.html에 있는 name꺼
		String pass = req.getParameter("pass");

		System.out.println("아이디:"+id);
		System.out.println("패스워드:"+pass);
	}

}

