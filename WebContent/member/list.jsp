<%@page import="member.MemberDTO"%>
<%@page import="dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
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
	    ArrayList<MemberDTO> arrlist= (ArrayList<MemberDTO>)request.getAttribute("arrlist");
		int size = (int)request.getAttribute("size");
	%>
	<h1>회원목록보기~~~~^^</h1>	
	<table width="500px" border="1">
		<tr>
			<th>아이디</th><th>비밀번호</th><th>이름</th>
			<th>주소</th><th>부서번호</th><th>입사일</th><th>점수</th><th>삭제</th>
		</tr>
	<% for(int i = 0;i<size;i++) {
			MemberDTO mem = arrlist.get(i);
	%>	
		<tr>
			<td><%=mem.getId() %></td>
			<td><%=mem.getPass() %></td>
			<td><a href="/serverweb/member/read.do?id=<%=mem.getId()%>"><%=mem.getName() %></a></td>
			<td><%=mem.getAddr() %></td>
			<td><%=mem.getDeptno() %></td>
			<td><%=mem.getHiredate() %></td>
			<td><%=mem.getPoint() %></td>
			<td><a href="/serverweb/member/delete.do?id=<%=mem.getId()%>">삭제</a></td>
		</tr>
	<% 
		}
	%>
	</table>				
</body>
</html>