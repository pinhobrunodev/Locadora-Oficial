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

@WebServlet(urlPatterns = {"/acessoAdmin/enviarlistarAdmin"})
public class ListarVeiculosAdminController extends HttpServlet {
	
	VeiculoBeans veiculosBeans = new VeiculoBeans();
	VeiculoDAO veiculoDAO = new VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = -4246897754762348804L;
	
	

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/acessoAdmin/enviarlistarAdmin")) {
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
	
	protected void listarVeiculos(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<VeiculoBeans> veiculos = veiculoDAO.listarVeiculos();
		req.setAttribute("registros", veiculos);
		RequestDispatcher rd = req.getRequestDispatcher("listarVeiculosAdmin.jsp");
		rd.forward(req, resp);
	}

}
