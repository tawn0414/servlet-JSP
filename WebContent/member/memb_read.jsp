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
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 아이디 -->
						<label class="control-label col-sm-2" for="orgcode">아이디</label>
						<div class="col-sm-3">
							<!-- 아이디를 이곳에 출력하세요 -->
							<%= read.getId() %>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 비밀번호-->
						<label class="control-label col-sm-2" for="orgname">비밀번호</label>
						<div class="col-sm-3">
							<!-- 비밀번호을 이곳에 출력하세요 -->
							<%= read.getPass() %>
						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 이름-->
						<label class="control-label col-sm-2" for="orgloc">이름</label>
						<div class="col-sm-3">
							<!-- 이름를 이곳에 출력하세요 -->
							<%= read.getName() %>

						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="orgtel">주소</label>
						<div class="col-sm-3">
							<!-- 주소를 이곳에 출력하세요 -->
							<%= read.getAddr() %>
						</div>
					</div>

					<div class="form-group">
						<!-- 부서번호-->
						<label class="control-label col-sm-2" for="orgtel">부서번호</label>
						<div class="col-sm-3">
							<!-- 부서번호를 이곳에 출력하세요 -->
							<%= read.getDeptno() %>
						</div>
					</div>
					<div class="form-group">
						<!-- 입사일-->
						<label class="control-label col-sm-2" for="orgtel">입사일</label>
						<div class="col-sm-3">
							<!-- 입사일을 이곳에 출력하세요 -->
							<%= read.getHiredate() %>

						</div>
					</div>
					<div class="form-group">
						<!-- 점수-->
						<label class="control-label col-sm-2" for="orgtel">점수</label>
						<div class="col-sm-3">
							<!-- 점수를 이곳에 출력하세요 -->
							<%= read.getPoint() %>

						</div>
					</div>
				
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="수정" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>