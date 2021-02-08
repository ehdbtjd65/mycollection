<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<title>Insert title here</title>
</head>
<body>

	포트 폴리오 올리기1
	<form class = writeForm action="portfolio-register" method="post"
		enctype="multipart/form-data">
		<br> 파일 : <input
			type="file" name="file"><br> 
			<input type="submit" value="업로드">
		<button id="cancel_btn" type="button">취소</button>
	</form>



	<script type="text/javascript">
		$(document).ready(function() {
			$('#cancel_btn').click(function() {

				location.href = "/mycollection/portfolio/myportfoliolist";

			});
			$('#submit_form').click(function(){
				var frm = $('.writeForm');
				frm.submit();
			});
					
		});
	</script>



</body>
</html>