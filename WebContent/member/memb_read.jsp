<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		MemberDTO read = (MemberDTO)request.getAttribute("read");
	%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
		action="/serverweb/action?deptno=<%= "001" %>&state=UPDATE" 
		method="get">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- ���̵� -->
						<label class="control-label col-sm-2" for="orgcode">���̵�</label>
						<div class="col-sm-3">
							<!-- ���̵� �̰��� ����ϼ��� -->
							<%= read.getId() %>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- ��й�ȣ-->
						<label class="control-label col-sm-2" for="orgname">��й�ȣ</label>
						<div class="col-sm-3">
							<!-- ��й�ȣ�� �̰��� ����ϼ��� -->
							<%= read.getPass() %>
						</div>
					</div>



				


					
					<div class="form-group">
						<!-- �̸�-->
						<label class="control-label col-sm-2" for="orgloc">�̸�</label>
						<div class="col-sm-3">
							<!-- �̸��� �̰��� ����ϼ��� -->
							<%= read.getName() %>

						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="orgtel">�ּ�</label>
						<div class="col-sm-3">
							<!-- �ּҸ� �̰��� ����ϼ��� -->
							<%= read.getAddr() %>
						</div>
					</div>

					<div class="form-group">
						<!-- �μ���ȣ-->
						<label class="control-label col-sm-2" for="orgtel">�μ���ȣ</label>
						<div class="col-sm-3">
							<!-- �μ���ȣ�� �̰��� ����ϼ��� -->
							<%= read.getDeptno() %>
						</div>
					</div>
					<div class="form-group">
						<!-- �Ի���-->
						<label class="control-label col-sm-2" for="orgtel">�Ի���</label>
						<div class="col-sm-3">
							<!-- �Ի����� �̰��� ����ϼ��� -->
							<%= read.getHiredate() %>

						</div>
					</div>
					<div class="form-group">
						<!-- ����-->
						<label class="control-label col-sm-2" for="orgtel">����</label>
						<div class="col-sm-3">
							<!-- ������ �̰��� ����ϼ��� -->
							<%= read.getPoint() %>

						</div>
					</div>
				
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="����" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>