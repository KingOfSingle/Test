<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<%String item = (String)request.getAttribute("result"); %>
<head>
	<title>Home</title>
	<style>
		#wrap{
			width:800px;
			margin: 0 auto;
			/* background-color: red; */	
			}
			
		#board_list{
			width: 100%;
		}	
		table{
			board-collapse: collapse;
			}
		
		table,th, td {
		    border: 1px solid black;
			}
		
		td{
		text-align: center;
		}
	</style>
</head>
<body>

<div id="wrap">
	<div id="header">게시판</div>
	<div id="content">
		<table id="board_list">
		<tr>
			<th>번호</th>
			<th>자제</th>
			<th>동록자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<tr>
			<td><%=item %></td>
			<td>노트북</td>
			<td>홍길동</td>
			<td>05.18</td>
			<td>12</td>
		</tr>
		</table>
		
		</div>
</div>		
		

</body>
</html>
