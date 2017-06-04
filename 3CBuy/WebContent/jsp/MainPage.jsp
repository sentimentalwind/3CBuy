<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p id="demo">这是我的第一个js测试</p>
<button onclick="myFunction()">点击这里</button>
<script>
function myFunction()
{
	var carname="Volvo";
	document.getElementById("demo").innerHTML=carname;
	}
</script>
</body>
</html>