package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ConfirmDao;
import entity.LoginUserInfo;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() { 
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    String username;
	    String password;
	    LoginUserInfo u=new LoginUserInfo();
	    ConfirmDao confirmdao=new ConfirmDao();
	    try
	    {
	    	username=request.getParameter("name");
	    	password=request.getParameter("password");
	    	u.setUsername(username);
	    	u.setPassword(password);
	    	System.out.println(password);
	    	String x=confirmdao.ConfirmUserInfo(u);
	    	if(password.equals(x))//���ݿ���û��������ƥ��
	    	{
	    		response.sendRedirect("jsp/MainPage.jsp");//����ת���ύ����¼�ɹ����ظ��û�
	    	}
	    	else
	    	{
	    		response.sendRedirect("jsp/LoginFail.jsp");
	    	}
	    	
	    }
	    catch(Exception ex)
	    {   System.out.println("ʲô���������ˣ�");
	    	ex.printStackTrace();
	    }
	}

}
