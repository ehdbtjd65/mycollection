<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>채용 정보</title>
</head>
<body>

	<form action="list">
	<div id="job_all">
		<pre>${vo.job_title}</pre>
		<pre>${vo.job_content }</pre>
		<pre>${vo.job_date }</pre>
	</div>
	</form>
	


</body>
</html>