<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3</title>
</head>
<body>
 <form method="post">
 	<input type="text" name="uid" value="u00">
 	<input type="text" name="upw" value="p00">
 	<input type="text" name="addr[0].zip" value="z00">
 	<input type="text" name="addr[0].tel" value="t00">
 	<input type="text" name="addr[1].zip" value="z01">
 	<input type="text" name="addr[1].tel" value="t01">
 	<input type="text" name="addr[2].zip" value="z02">
 	<input type="text" name="addr[2].tel" value="t02">
 	<button>submit</button>
 </form>
</body>
</html>