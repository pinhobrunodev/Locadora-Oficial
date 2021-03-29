package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VeiculoBeans;
import dao.VeiculoDAO;

@WebServlet(urlPatterns = { "/acessoAdmin/insertVeiculo" })
public class CadastrarVeiculoController extends HttpServlet {

	VeiculoBeans veiculoBeans = new VeiculoBeans();
	VeiculoDAO veiculoDAO = new VeiculoDAO();

	/**
	 * 
	 */
	private static final long serialVersionUID = 3931896066651252L;

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getServletPath();
		if (path.equals("/acessoAdmin/insertVeiculo")) {
			registrarVeiculo(req, resp);
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

	protected void registrarVeiculo(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		veiculoBeans.setModelo(req.getParameter("modeloCadastroVeiculo"));
		veiculoBeans.setPlaca(req.getParameter("placaCadastroVeiculo"));
		veiculoBeans.setCor(req.getParameter("corCadastroVeiculo"));
		veiculoBeans.setValor(req.getParameter("valorCadastroVeiculo"));

		if (veiculoDAO.validarPlacaVeiculo(req.getParameter("placaCadastroVeiculo"))) {
			System.out.println("Placa ja esta sendo usada");
			resp.sendRedirect("registrarVeiculo.jsp");
		} else {
			veiculoDAO.adicionarVeiculo(veiculoBeans);
			resp.sendRedirect("menuAdmin.jsp");
		}
	}

}
