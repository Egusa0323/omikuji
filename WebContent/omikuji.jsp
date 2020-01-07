<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>今日のおみくじ</title>
    </head>
    <body>
        <h1>今日のおみくじ</h1>
        <form action="/first_webapp/OmikujiServlet" method="POST">
            <p>氏名</p><input type="text" name="my_name">
            <p><input type="submit" value="占う！"></p>
        </form>

    </body>
</html>