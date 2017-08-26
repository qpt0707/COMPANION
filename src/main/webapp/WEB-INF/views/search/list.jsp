<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>자료사전 목록</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="/dic/resources/js/jquery-1.9.1.min.js"/></script>
</head>
<body>
	<h2>자료사전</h2>
	 <div>
		<form name="form1" method="post" action="${path}/dic/search/list.do">
		<span style="float:center;">
	        <select name="searchOption">
	            <option value="all" <c:out value="${map.searchOption == 'all'?'selected':''}"/> >all</option>
	            <option value="writer" <c:out value="${map.searchOption == 'ko'?'selected':''}"/> >한글</option>
	            <option value="content" <c:out value="${map.searchOption == 'eng'?'selected':''}"/> >영어</option>
	        </select>
	        <input name="keyword" value="${map.keyword}" placeholder="검색어를 입력하세요">
	        <input type="submit" value="검색">
	        </span>
	    </form>
	</div>
	<div>
	  <table border="1" width="600px" align="center">
	    <tr>
	        <th>번호</th>
	        <th>한글</th>
	        <th>영어</th>
	        <th>자바변수</th>
	        <th>컬럼변수</th>
	    </tr>
	    <c:forEach var="search" items="${map.list}">
	    <tr>
	        <td>${search.mnum}</td>
	        <td>${search.ko}</td>
	        <td>${search.eng}</td>
	        <td>${search.java_va}</td>
	        <td>${search.col_va}</td>
	    </tr>    
	    </c:forEach>
	  </table>
	</div>
</body>
</html>
