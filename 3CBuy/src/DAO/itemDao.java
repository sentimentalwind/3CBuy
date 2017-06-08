package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Item;
import util.DBHelper;

//商品的业务逻辑类
public class itemDao {

	public ArrayList<Item> getAllItems()
	{
		
		
		Connection conn=null;//数据库链接变量
		PreparedStatement stmt =null;//语句集
		ResultSet rs=null;//结果集
		ArrayList<Item> list =new ArrayList<Item>();//商品集合
		
		
		try
		{
			conn=DBHelper.getConnection();
			String sql="select * from item;";//SQL语句
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			
			while(rs.next())
			{
				Item item=new Item();
				item.setItemName(rs.getString("ItemName"));
				item.setItemPrice(rs.getInt("ItemPrice"));
				item.setLocation(rs.getString("location"));
				item.setPicture(rs.getString("picture"));
				item.setComments(rs.getString("comments"));
				list.add(item);
			}
			return list;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally
		{
			//释放数据及对象
			if(rs!=null)
			{
				try
				{
					rs.close();
					rs=null;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			//释放结果集对象
			if(stmt!=null)
			{
				try
				{
					stmt.close();
					stmt=null;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
}
