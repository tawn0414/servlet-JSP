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
	<h1>ȸ����Ϻ���~~~~^^</h1>	
	<table width="500px" border="1">
		<tr>
			<th>���̵�</th><th>��й�ȣ</th><th>�̸�</th>
			<th>�ּ�</th><th>�μ���ȣ</th><th>�Ի���</th><th>����</th><th>����</th>
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
			<td><a href="/serverweb/member/delete.do?id=<%=mem.getId()%>">����</a></td>
		</tr>
	<% 
		}
	%>
	</table>				
</body>
</html>