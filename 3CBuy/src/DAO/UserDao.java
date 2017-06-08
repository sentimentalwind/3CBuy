package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBHelper;

public class UserDao {
	public void saveUserInfo(String name,String password,String email,String number)
	{
		
		
		Connection conn=null;//数据库链接变量
		PreparedStatement stmt =null;//语句集
		try
		{
			conn=DBHelper.getConnection();
			String sql="insert into userinfo(username,password,email,number) values(?,?,?,?)";
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.setString(3,email);
			stmt.setString(4,number);
		}
		catch(Exception ex)
		{
			System.out.print("没有成功！");
			ex.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try
				{
					stmt.executeUpdate();
					stmt.close();
					stmt=null;
				}
				catch(Exception ex)
				{
					System.out.print("没有成功！");
					ex.printStackTrace();
				}
			}
		}
	}
}
