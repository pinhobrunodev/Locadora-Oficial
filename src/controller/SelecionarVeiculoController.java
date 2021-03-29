package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VeiculoBeans;
import dao.VeiculoDAO;


@WebServlet(urlPatterns = {"/acessoAdmin/select"})
public class SelecionarVeiculoController extends HttpServlet{
	VeiculoBeans veiculoBeans = new VeiculoBeans();
	VeiculoDAO veiculoDAO = new VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = 2267031294097005497L;
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/acessoAdmin/select")) {
			selecionarVeiculo(req, resp);
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
	
	protected void selecionarVeiculo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		veiculoBeans.setId(Integer.parseInt(req.getParameter("id")));
		veiculoDAO.selecionarVeiculo(veiculoBeans);
		req.setAttribute("id", veiculoBeans.getId());
		req.setAttribute("modelo", veiculoBeans.getModelo());
		req.setAttribute("placa", veiculoBeans.getPlaca());
		req.setAttribute("cor", veiculoBeans.getCor());
		req.setAttribute("valor", veiculoBeans.getValor());
		
		RequestDispatcher rd = req.getRequestDispatcher("editarVeiculo.jsp");
		rd.forward(req, resp);
		
	}
	

}
