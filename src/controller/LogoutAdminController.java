package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/acessoAdmin/logoutAdmin" })
public class LogoutAdminController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6818614636227443604L;

	
	

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getServletPath();
		if(path.equals("/acessoAdmin/logoutAdmin")) {
			logoutAdmin(req, resp);
		}
  
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.process(req, resp);
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.process(req, resp);
	}
	

	protected void logoutAdmin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession();
	    req.getSession().setAttribute("logado", null);
	    session.invalidate();
	    System.out.println("Admin saiu da sessao");
	    resp.sendRedirect("../index.html");
	
	}

}
