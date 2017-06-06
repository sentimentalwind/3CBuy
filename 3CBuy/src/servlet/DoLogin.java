package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	    try
	    {
	    	username=request.getParameter("name");
	    	password=request.getParameter("password");
	    	u.setUsername(username);
	    	u.setPassword(password);
	    	//request.getSession().setAttribute("loginS", u);//���û���Ϣ������session�У�ȡ�����ֽ�loginS
			request.getRequestDispatcher("jsp/MainPage.jsp").forward(request, response);//����ת���ύ����¼�ɹ����ظ��û�
	    	
	    }
	    catch(Exception ex)
	    {   System.out.println("ʲô���������ˣ�");
	    	ex.printStackTrace();
	    }
	}

}
