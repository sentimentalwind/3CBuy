<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
   <h1>注册信息</h1>
   <form action="<%=request.getContextPath()%>/demo" method="POST">
   <table border="0" width="800" cellspacing="1" cellpadding="1">
                <tr>
			    	<td class="lalel">用户名：</td>
			    	<td class="controler"><input type="text" name="name" /></td>
			    </tr>
			    <tr>
			    	<td class="label">密码：</td>
			    	<td class="controler"><input type="password" name="password" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">确认密码：</td>
			    	<td class="controler"><input type="password" name="confirpass" ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">电子邮箱：</td>
			    	<td class="controler"><input type="text" name="email" ></td>
			    	
			    </tr>
			    
			    <tr>
                    <td class="label">手机号：</td>
                    <td class="controler"><input type="text" name="number"></td>
               </tr>
      
      
                <tr>
			    	<td colspan="2" align="center">
			    		<input type="submit" value="注册"/>&nbsp;&nbsp;<br>
			    	    <input type="reset" value="取消"/>&nbsp;&nbsp;<br>
			    	</td>
			    </tr>

	
    </table>
   </form>
</body>

</html>