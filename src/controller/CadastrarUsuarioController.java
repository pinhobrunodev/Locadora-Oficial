package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioBeans;
import dao.UsuarioDAO;

@WebServlet(urlPatterns = { "/insert" })
public class CadastrarUsuarioController extends HttpServlet {

	UsuarioBeans usuarioBeans = new UsuarioBeans();
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	private static final long serialVersionUID = 1L;

	public CadastrarUsuarioController() {

	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();
		if (path.equals("/insert")) {
			registrarUsuario(request, response);
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

	protected void registrarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		usuarioBeans.setNome(request.getParameter("nomeCadastro"));
		usuarioBeans.setSenha(request.getParameter("senhaCadastro"));
		usuarioBeans.setUsuario(request.getParameter("usuarioCadastro"));
		usuarioBeans.setEmail(request.getParameter("emailCadastro"));

		if (usuarioDAO.validarUsuarioExistente(request.getParameter("usuarioCadastro"))) {

			System.out.println("Usuario ja existente");

			response.sendRedirect("cadastroUsuario.jsp");
		} else {
			usuarioDAO.adicionarUsuario(usuarioBeans);
			response.sendRedirect("login.jsp");
		}

	}

}
