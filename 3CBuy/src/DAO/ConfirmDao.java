package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Item;
import entity.LoginUserInfo;
import util.DBHelper;
//�����ݿ�����û����ֺ�����
public class ConfirmDao {
	public String ConfirmUserInfo(LoginUserInfo u)
	{
		
		
		Connection conn=null;//���ݿ����ӱ���
		PreparedStatement stmt =null;//��伯
		ResultSet rs=null;//�����
		
		try
		{
			conn=DBHelper.getConnection();
			String sql="select * from userinfo where username=?";//SQL���
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
			//�ͷ����ݼ�����
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
			//�ͷŽ��������
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
