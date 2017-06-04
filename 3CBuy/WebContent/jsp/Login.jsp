<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<center>
<body>
<form action="servlet/demo" method="post">
<fieldset>
<legend>登录</legend>
 用户名:<input type="text" name="name" size="20" maxlength="18" placeholder="用户名" id="name" required="true"><br><br>
      密码:<input type="password" name="password" id="password" size="30" maxlength="25" placeholder="密码"onblur="pwdComplex()" onkeyup="pwdComplex()" required="true"><br><br>
       <input type="button" value="登录">
        <input type="button" value="注册">
   </fieldset>
  </form>
</body>
</center>

</html>