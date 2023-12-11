<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Hello world!
	</h1>
	
	<h2 align="left">구구단</h2>
	<table border="1">
	
	<% for(int i = 1; i<=9; i++){ %>
	<tr>
		<%for(int j = 1; j<=9; j++){ %>
		<td>
			<% out.print(j + "X" + i + "=" + i*j);%>
		</td>
		<% }%>
		</tr>
	<% }%>
			 
			
	
	
	</table>
</body>
</html>