package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Item;
import entity.LoginUserInfo;
import util.DBHelper;
//从数据库提出用户名字和密码
public class ConfirmDao {
	public String ConfirmUserInfo(LoginUserInfo u)
	{
		
		
		Connection conn=null;//数据库链接变量
		PreparedStatement stmt =null;//语句集
		ResultSet rs=null;//结果集
		
		try
		{
			conn=DBHelper.getConnection();
			String sql="select * from userinfo where username=?";//SQL语句
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, u.getUsername());
			rs=stmt.executeQuery();
			
			if(rs.next())
			{    
				rs.getString("password");
			}
			return rs.getString("password");
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
