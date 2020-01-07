<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String name = (String)request.getAttribute("my_name");
int number = (int)request.getAttribute("my_age");
%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
    <h1><%= name %></h1>
    <%= number  %>
    </body>
</html>