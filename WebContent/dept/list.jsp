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
	    ArrayList<DeptDTO> arrlist= (ArrayList<DeptDTO>)request.getAttribute("arrlist");
	    int size= (int)request.getAttribute("size");
	%>
	<h1>부서목록보기~~~~^^</h1>	
	<table width="500px" border="1">
		<tr>
			<th>부서코드</th><th>부서이름</th><th>전화번호</th>
			<th>부서위치</th><th>관리자</th><th>삭제</th>
		</tr>
	<% for(int i = 0;i<size;i++) {
			DeptDTO dept = arrlist.get(i);
	%>	
		<tr>
			<td><%=dept.getDeptno() %></td>
			<td><%=dept.getDeptName() %></td>
			<td><%=dept.getTel() %></td>
			<td><%=dept.getLoc() %></td>
			<td><%=dept.getMgr() %></td>
			<td><a href="/serverweb/dept/delete.do?deptno=<%=dept.getDeptno()%>">삭제</a></td>
		</tr>
	<% 
		}
	%>
	</table>				
</body>
</html>