<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
	
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
if 포트폴리오 존재시 새로 만들기 버튼 숨기기 
      ㄴ 나중에 아이프레임으로 쓸예정 
      ㄴ


 -->
 <img src="/1.png" />
 <img src='../../../../file/PdfRoute/2.jpg' />
  156789<br>
  <img src="../../../../file/PdfRoute/1.png" />
  <img src="../pdftest/main/file/PdfRoute/1.png" />
  
 ${vo.user_id }
 ${vo.portfolio_url }
 ${vo.portfolio_page_count }
 11111111111111111111111111
 ${vo.portfolio_url }-1.png
 
 <br>

 <br>
  
  <%-- 
   <img src="./mycollection/src/main/file/PdfRoute/6abd4964-660f-4543-a84d-48931606fe1e_test.pdf-0.png" /> <br> 

    <img src="/mycollection/mycollection/src/main/file/PdfRoute/6abd4964-660f-4543-a84d-48931606fe1e_test.pdf-0.PNG" /> 
   <br> <br> <br> <br>
<% for (int i=0; i< 20 ; i++) { %>
<img src='${vo.portfolio_url }-<%=i%>.PNG' />
<% } %> --%>

	포토폴리오 리스트

	<button
		onclick="location = '/mycollection/portfolio/portfolio-register'"
		type="button">새로만들기</button>

</body>
</html>