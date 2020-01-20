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
	<div><a href="/serverweb/member/list.do">ȸ�� ��� ����</a></div>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/serverweb/member/insert.do" method="POST">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- ȸ�����̵� -->
						<label class="control-label col-sm-2" for="orgcode">ȸ�����̵�</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="id"
								placeholder="�μ��ڵ�" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- ��й�ȣ-->
						<label class="control-label col-sm-2" for="orgname">��й�ȣ</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="pass"
								placeholder="�μ���" class="form-control" minlength="4" required>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- �̸�-->
						<label class="control-label col-sm-2" for="orgloc">�̸�</label>
						<div class="col-sm-3">
							<input type="text" id="orgloc" name="name"
								placeholder="�μ���ġ" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="orgtel">�ּ�</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="addr" 
							placeholder="��ȭ��ȣ"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ�-->
						<label class="control-label col-sm-2" for="orgtel">�μ��ڵ�</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="deptno" 
							placeholder="������"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- �Ի���-->
						<label class="control-label col-sm-2" for="orgtel">�Ի���</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="hiredate" 
							placeholder="������"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- ����-->
						<label class="control-label col-sm-2" for="orgtel">����</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="point" 
							placeholder="������"
								class="form-control" minlength="4" required>

						</div>
					</div>

					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="�����ϱ�" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>
</body>
</html>