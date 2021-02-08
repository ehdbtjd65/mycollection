<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 작성</title>
</head>
<body>

	<div id="registerContent">
		 <textarea rows="30" cols="80" name="d_content"
            placeholder="내용 입력" required></textarea>
	</div>


	 <div id="submit_list">
         <a href="diarylist"><input type="button" value="목록"></a>
         <input type="submit" value="등록">
	</div>
	







</body>
</html>