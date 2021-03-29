package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VeiculoBeans;
import dao.VeiculoDAO;

@WebServlet(urlPatterns = { "/listarVeiculosUsuario" })
public class ListarVeiculosUsuarioController extends HttpServlet {

	VeiculoDAO veiculoDAO = new VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = 689460405984916863L;

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if (path.equals("/listarVeiculosUsuario")) {
			listarVeiculos(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.process(req, resp);
	}

	protected void listarVeiculos(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ArrayList<VeiculoBeans> veiculos = veiculoDAO.listarVeiculos();
		req.setAttribute("registros", veiculos);
		RequestDispatcher rd = req.getRequestDispatcher("listarVeiculosUsuario.jsp");
		rd.forward(req, resp);
	}

}
