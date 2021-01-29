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

포트 폴리오 올리기 

<button id="insert_btn" type="button">작성</button>



<script type="text/javascript">
		$(document).ready(function() {
			$('#insert_btn').click(function() {
			
				 location.href = "/mycollection/portfolio/myportfoliolist";
			
		
				}

			);
		
		});
	</script>



</body>
</html>