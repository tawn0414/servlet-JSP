<%@page import="dept.DeptDTO"%>
<%@page import="dept.DeptDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		DeptDAO dao = new DeptDAO();
		DeptDTO dept = new DeptDTO(deptNo,deptName,loc,tel,mgr);
		int result = dao.insert(dept);
		
	%>
		<h1><%= result+"���� �� ���Լ���" %></h1>
		
</body>
</html>