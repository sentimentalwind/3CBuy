package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.UserInfo;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo() {
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
		
		UserInfo u=new UserInfo();
		String name;
		String password;
		String email;
		String number;
		
		
		
		try
		{
			
			name=request.getParameter("name");
			password=request.getParameter("password");
			email=request.getParameter("email");
			number=request.getParameter("number");
			//获取多个值
			u.setName(name);
			u.setPassword(password);
			u.setEmail(email);
			u.setNumber(number);
			request.getSession().setAttribute("regUsers", u);//把用户信息保存在session中，取个名字叫regUsers
			request.getRequestDispatcher("jsp/RegSuccess.jsp").forward(request, response);//请求转发提交给注册成功返回给用户
			
		}
		catch(Exception ex)
		{
			
			System.out.println("什么？出错了！");
			ex.printStackTrace();
			
		}
	}

}
