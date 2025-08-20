package vn.iotstar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSessionController
 */
@WebServlet("/login-session")
public class LoginSessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSessionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");


		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();

		if ("kenguyen".equals(user) && "123".equals(pass)) {
			out.printf("Chào mừng bạn: " + user);
			HttpSession session = request.getSession();
			session.setAttribute("name", user);
		} else {
			out.printf("Tài khoản hoặc mật khẩu của bạn không chính xác");
			request.getRequestDispatcher("index.jsp").include(request,
					response);
		}
	}
}
