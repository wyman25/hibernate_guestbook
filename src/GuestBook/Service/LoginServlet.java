package GuestBook.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import GuestBook.Guest;
import GuestBook.Dao.GuestDao;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/GuestBook/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		GuestDao guestDao=new GuestDao();
		Guest guest=guestDao.findGuest(userName);
		if(guest!=null){
			HttpSession session=request.getSession();
			session.setAttribute("userInfo",userName);
			response.sendRedirect("/guest");
		}else{
			response.sendRedirect("/login");
		}
	}

}
