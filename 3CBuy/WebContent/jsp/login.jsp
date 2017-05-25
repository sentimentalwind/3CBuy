<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
	function pwdComplex()
	{
	    var Psw=document.getElementById("password"); //得到密码
        var Color=document.getElementById("tip"); //得到强度标签
        var strongthTip=document.getElementById("strongthTip");//获取密码强度提示文字的对象
        var regxs = new Array();//定义一个数组用于存放不同的正则表达式
        regxs[0]=/[^a-zA-Z0-9_]/g;//特殊字符
        regxs[1]=/[a-z]/g;//小写
        regxs[2]=/[0-9]/g;//数字
        regxs[3]=/[A-Z]/g;//大写
        var val = Psw.value;//获取用户输入的密码
        var length = val.length;//获取用户输入的密码长度
        var sec = 0;
        if (length > 5)//至少6个数的密码
        { 
            for (var i = 0; i < regxs.length; i++)
            {
                if (val.match(regxs[i])) //和正则表达式匹配判断
                {
                    sec++;
                }
            }
        }
        if(sec==0) //通过不同的密码强度调用不同的样式
        {
            strongthTip.innerText="        ";
            Color.setAttribute("class","cinnerprogress");
        }
        else if(sec==1)//内联的CSS
        {
            strongthTip.innerText="强度：弱";
            strongthTip.style.color="red";
            Color.setAttribute("class","strengthLv1");
                
        }
        else if(sec==2)
        {
            strongthTip.innerText="强度：中";    
            strongthTip.style.color="orange";
            Color.setAttribute("class","strengthLv2");
            
        }
        else if(sec==3)
        {
            strongthTip.innerText="强度：强";    
            strongthTip.style.color="blue";
            Color.setAttribute("class","strengthLv3");
            
        }
        else if(sec==4)
        {
            strongthTip.innerText="强度：超强";    
            strongthTip.style.color="green";
            Color.setAttribute("class","strengthLv4");
            
        }
	}
	</script>
	<hr />
</head>
<body>
<form method="POST">
	<fieldset>
	  <legend>注册信息</legend>
      昵称:<input type="text" name="name" size="20" maxlength="18" placeholder="昵称" id="name" required><br><br>
      密码:<input type="password" name="password" id="password" size="30" maxlength="25" placeholder="密码"onblur="pwdComplex()" onkeyup="pwdComplex()" required><br><br>
	  密码强度：<div class="pwdStrongth"><span class="cinnerprogress" id="tip"></span></div>
	  <font id="strongthTip"></font><br><br>
	  性别:<input type="radio" name="gender" value="male" checked>男
           <input type="radio" name="gender" value="female">女<br><br>
      邮箱:<input type="email" name="email" size="30" maxlength="25" autocomplete="on" placeholder="邮箱" id="email" required><br><br>
	  生日:<input type="date" name="bday" min="1979-12-31" max="2017-03-07" >
	  <br><br>
	 
    <input type="submit")" value="提交">
	
    </fieldset>
   </form>
</body>
</html>