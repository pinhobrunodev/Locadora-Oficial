package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = { "/acessoAdmin/menuAdmin.jsp","/acessoAdmin/registrarVeiculo.jsp","/acessoAdmin/editarVeiculo.jsp", 
		"/acessoAdmin/listarVeiculosAdmin.jsp"})
public class AcessFilterAdmin implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;

		Object object = httpRequest.getSession().getAttribute("logado");
		
	

		if (object == null || !object.equals("admin")) {
			HttpServletResponse servletResponse = (HttpServletResponse) response;
			servletResponse.sendRedirect("../login.jsp");
			System.out.println("Tentativa de acesso na pasta /acessoAdmin/* -- "+request.getLocalName());

		} else {
			filter.doFilter(request, response);
			System.out.println("Response ---  o Usuario "+object+" entrou na sessao");
		}

	}

}