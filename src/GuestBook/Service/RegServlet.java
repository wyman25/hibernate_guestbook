package GuestBook.Service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GuestBook.Guest;
import GuestBook.Dao.GuestDao;

//@WebServlet("/GuestBook/reg")
public class RegServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GuestDao guestDao=new GuestDao();
		String userName=req.getParameter("userName");
		
		if(userName!=null){
			Guest entity=guestDao.findGuest(userName);
			if(entity!=null){
				String password=req.getParameter("password");
				String email=req.getParameter("email");
				String alias=req.getParameter("alias");
				
				Guest guest=new Guest();
				guest.setAlias(alias);
				guest.setEmail(email);
				guest.setPassword(password);
				guest.setUsername(userName);
				
				guestDao.SaveGuest(guest);
				
			}else{
				resp.getWriter().append("User exists");
			}
		}else{
			resp.getWriter().append("User name is required");
		}
	}
	
}
