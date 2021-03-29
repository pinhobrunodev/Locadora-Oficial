package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UsuarioBeans;
import dao.UsuarioDAO;

@WebServlet(urlPatterns = { "/login" })
public class ValidarLoginUsuarioController extends HttpServlet {

	UsuarioBeans usuarioBeans = new UsuarioBeans();
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	private static final long serialVersionUID = -2359725327063176835L;

	public ValidarLoginUsuarioController() {
		super();

	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();
		if (path.equals("/login")) {
			validarLogin(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}
	
	
	/**
	 * 
	 * @comment
	 * 
	 * Problema esta ai...
	 * 
	 * 
	 */

	protected void validarLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuarioLogin");
		String senha = request.getParameter("senhaLogin");

		if (usuarioDAO.validarLoginAdmin(usuario, senha)) {
			HttpSession session = request.getSession();
			session.setAttribute("logado", usuario);
			response.sendRedirect("acessoAdmin/menuAdmin.jsp");
		} else if (usuarioDAO.validarLogin(usuario, senha)) {
			HttpSession session = request.getSession();
			session.setAttribute("logado", usuario);
			response.sendRedirect("menuUsuario.jsp");
		}

		else {
			response.sendRedirect("login.jsp");
		}

	}

}
