package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("euc-kr");
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");
		
		System.out.println("Customer");
		System.out.println("=================");
		System.out.println("아이디:"+userId);
		System.out.println("이름:"+userName);
		System.out.println("비밀번호:"+passwd);
		System.out.println("성별:"+gender);
		System.out.println("직업:"+job);
		for (int i=0; i<item.length;i++) {
			System.out.println("favorite:"+item[i]);
		}

		
	}
}
