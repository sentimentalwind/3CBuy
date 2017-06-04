<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
      function validate_email(field)
      { 
    	  with (field)
    	  {
    	  apos=value.indexOf("@")
    	  dotpos=value.lastIndexOf(".")
    	  if (apos<1||dotpos-apos<2) 
    	    {alert("邮箱格式不正确");return false;}
    	  else {return true}
    	  }
      }//对于邮箱的验证
      function CheckInfo(field)
      {
    	  with(field)
    	  {
    		 if(value==null||value=="")
    	     {
    			 alert("表格内有必填选项没有填哦");
    	         return false;
    	     }
    		 else return true;
    	  }
      }//对于其他表单的验证
      function CheckAll(thisform)
      {
        with (thisform)
    	{
    	if (validate_email(email)==false||CheckInfo(name)==false||CheckInfo(password)==false||CheckInfo(number)==false)
    	  {
    		name.focus();
    		email.focus();
    		password.focus();
    		number.focus();
    	    return false;
    	  }
    	} 
      }//以上是表单验证    
</script>
</head>
<body>
<center>
   <h1 id="x">注册</h1>
   <script>
      document.getElementById("x").style.color="#00E5EE";
	  document.getElementById("x").style.fontFamily="Arail";
	  document.getElementById("x").style.fontSize=20;
  </script>
   <form action="<%=request.getContextPath()%>/demo"onsubmit="return CheckAll(this);" method="POST">
   <table border="0" width="800" cellspacing="5" cellpadding="5">
                <tr>
			    	<td class="label"  id="01">用户名：</td>
			    	<td class="controler"><input type="text" name="name"  id=name/></td>
			    	
			    </tr>
			    
			    <tr>
			    	<td class="label">密码：</td>
			    	<td class="controler"><input type="password" name="password"  id=password></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">确认密码：</td>
			    	<td class="controler"><input type="password" name="confirpass" id=confirpass ></td>
			    	
			    </tr>
			    <tr>
			    	<td class="label">电子邮箱：</td>
			    	<td class="controler"><input type="text" name="email" id=email></td>
			    	
			    </tr>
			    
			    <tr>
                    <td class="label">手机号：</td>
                    <td class="controler"><input type="text" name="number" id=number></td>
               </tr>
     
      
                <tr>
			    	<td colspan="2" align="center">
			    		<input type="submit" value="注册" />&nbsp;&nbsp;
			    	    <input type="reset" value="取消"/>&nbsp;&nbsp;
			    	</td>
			    </tr>

	
    </table>
   </form>
    
</body>
</center>
</html>