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


@WebServlet(urlPatterns = {"/acessoAdmin/atualizarVeiculo"})
public class AtualizarVeiculoController extends HttpServlet{
	VeiculoBeans veiculoBeans = new VeiculoBeans();
	VeiculoDAO veiculoDAO = new VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = 2267031294097005497L;
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/acessoAdmin/atualizarVeiculo")) {
			atualizarVeiculo(req, resp);
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
	
	protected void atualizarVeiculo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		veiculoBeans.setId(Integer.parseInt(req.getParameter("id")));
		veiculoBeans.setValor(req.getParameter("valor"));
		veiculoDAO.atualizarVeiculo(veiculoBeans);
		ArrayList<VeiculoBeans> veiculos = veiculoDAO.listarVeiculos();
		req.setAttribute("registros", veiculos);
		RequestDispatcher rd = req.getRequestDispatcher("listarVeiculosAdmin.jsp");
		rd.forward(req, resp);
		
	
	}
	

}
