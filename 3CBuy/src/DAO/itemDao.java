package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Item;
import util.DBHelper;

//��Ʒ��ҵ���߼���
public class itemDao {

	public ArrayList<Item> getAllItems()
	{
		
		
		Connection conn=null;//���ݿ����ӱ���
		PreparedStatement stmt =null;//��伯
		ResultSet rs=null;//�����
		ArrayList<Item> list =new ArrayList<Item>();//��Ʒ����
		
		
		try
		{
			conn=DBHelper.getConnection();
			String sql="select * from item;";//SQL���
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
