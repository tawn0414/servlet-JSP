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
	<div><a href="/serverweb/member/list.do">회원 목록 보기</a></div>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/serverweb/member/insert.do" method="POST">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 회원아이디 -->
						<label class="control-label col-sm-2" for="orgcode">회원아이디</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="id"
								placeholder="부서코드" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 비밀번호-->
						<label class="control-label col-sm-2" for="orgname">비밀번호</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="pass"
								placeholder="부서명" class="form-control" minlength="4" required>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 이름-->
						<label class="control-label col-sm-2" for="orgloc">이름</label>
						<div class="col-sm-3">
							<input type="text" id="orgloc" name="name"
								placeholder="부서위치" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="orgtel">주소</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="addr" 
							placeholder="전화번호"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 부서코드-->
						<label class="control-label col-sm-2" for="orgtel">부서코드</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="deptno" 
							placeholder="관리자"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 입사일-->
						<label class="control-label col-sm-2" for="orgtel">입사일</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="hiredate" 
							placeholder="관리자"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 점수-->
						<label class="control-label col-sm-2" for="orgtel">점수</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="point" 
							placeholder="관리자"
								class="form-control" minlength="4" required>

						</div>
					</div>

					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="가입하기" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>
</body>
</html>