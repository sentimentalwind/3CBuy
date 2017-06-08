package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private static final String driver = "com.mysql.jdbc.Driver"; //���ݿ�����
	//�������ݿ��URL��ַ
	private static final String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8"; 
	private static final String username="root";//���ݿ���û���
	private static final String password="123456";//���ݿ������
	
	private static Connection conn=null;
	//��̬�Ĵ��븺���������
	static
	{
		try
		{
			Class.forName(driver);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//����ģʽ����һ�����ݿ����Ӷ���
	public static Connection getConnection()throws Exception
	{
		if(conn==null)
		{
			conn=DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
	public static void main(String[] args)
	{
		try
		{
			Connection conn=DBHelper.getConnection();
			if(conn!=null)
			{
				System.out.println("���ݿ����ӳɹ���");
			}
			else
			{
				System.out.println("���ݿ�����ʧ�ܣ�");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
