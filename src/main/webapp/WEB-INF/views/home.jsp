<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

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
