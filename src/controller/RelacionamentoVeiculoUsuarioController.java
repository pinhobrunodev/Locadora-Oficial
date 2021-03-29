package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioBeans;
import beans.VeiculoBeans;
import dao.Usuario_VeiculoDAO;
import dao.VeiculoDAO;

@WebServlet(urlPatterns = { "/sucesso" })
public class RelacionamentoVeiculoUsuarioController extends HttpServlet {

	VeiculoBeans veiculoBeans = new VeiculoBeans();
	UsuarioBeans usuarioBeans = new UsuarioBeans();
	Usuario_VeiculoDAO u_vd = new Usuario_VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = 3931896066651252L;

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getServletPath();
		if (path.equals("/sucesso")) {
			relacionarTabelas2(req, resp);
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

	protected void relacionarTabelas2(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		u_vd.relacionarTabelas2(Integer.parseInt(req.getParameter("idVeiculo")),
				Integer.parseInt(req.getParameter("idUsuario")));
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		
		
		//TODO 
		//veiculoDAO.removerVeiculoPorId(Integer.parseInt(req.getParameter("idVeiculo")));
		
		resp.sendRedirect("sucesso.html");
		
		System.out.println("Adicionado !");
	}

}
