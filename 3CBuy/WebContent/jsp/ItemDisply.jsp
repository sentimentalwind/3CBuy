<%@ page language="java"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="DAO.itemDao" import="java.util.ArrayList" import="entity.Item"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品展示</title>
<center><h1>商品展示<h1></center>
<style type="text/css">
	   div{
	      float:left;
	      margin: 20px;
	   }
	   div dd{
	      margin:0px;
	      font-size:10pt;
	   }
	   div dd.dd_name
	   {
	      color:blue;
	   }
	   div dd.dd_city
	   {
	      color:#000;
	   }
	</style>
	 <jsp:useBean id="item" class="entity.Item" scope="session"/><!--创建的javabeans  --> 
</head>
<body>
<center>
<table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
  <tr>
    <td>
    <%
        itemDao userdao=new itemDao();
        ArrayList<Item>list=userdao.getAllItems();
        if(list!=null&&list.size()>0)
        { 
	          for(int i=0;i<list.size();++i)
	          {
	             item=list.get(i);
   
    %>
           <div>
             <dl>
               <dt>
                 <img src="../image/<%=item.getPicture()%>" width="120" height="90" border="1"/>
               </dt>
               <dd class="dd_name"><%=item.getItemName() %></dd> 
               <dd class="dd_city">产地:<%=item.getLocation() %>&nbsp;&nbsp;价格:￥ <%=item.getItemPrice() %></dd> 
             </dl>
          </div>
    <%
              } 
        }
    %>
    <td>
  </tr>
  </table>
  </center>
</body>
</html>