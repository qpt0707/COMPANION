<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %> <!-- JNDI를 위해서 import 함 -->
<%
  Connection conn = null;  
 try {
    Context init = new InitialContext();
    DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/MySQLDS"); 
	// JNDI(Context.xml) 설정 해 놓은 OracleDB를 참조하여 Connection 객체를 가져옴.
    conn = ds.getConnection();
    out.println("<h3>DB에 연결되었습니다.</h3>");
 }catch(Exception e){
  	out.println("<h3>DB에 연결에 실패하였습니다.</h3>");
  	out.println(e.getMessage());
  	e.printStackTrace();
  }
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>시작페이지 - 자료사전</title>
</head>
<body>
	<h1>COMPANION SYSTEM 실습 - 자료사전</h1>
	<h2><a href="${path}/dic/search/list.do">data dictionary</a></h2>
</body>
</html>