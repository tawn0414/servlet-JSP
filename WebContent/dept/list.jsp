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
	<h1>�μ���Ϻ���~~~~^^</h1>	
	<table width="500px" border="1">
		<tr>
			<th>�μ��ڵ�</th><th>�μ��̸�</th><th>��ȭ��ȣ</th>
			<th>�μ���ġ</th><th>������</th><th>����</th>
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
			<td><a href="/serverweb/dept/delete.do?deptno=<%=dept.getDeptno()%>">����</a></td>
		</tr>
	<% 
		}
	%>
	</table>				
</body>
</html>