package filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter(urlPatterns = {"/menuUsuario.jsp","/listarVeiculosUsuario.jsp","/alugarVeiculo.jsp","/sucesso.html"})
public class AcessFilterNormalUser implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
			
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			
			System.out.println("Requisição "+request.getRemoteAddr());
			// Continua a chamada
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			Object object = httpRequest.getSession().getAttribute("logado");
			System.out.println("Tentativa de acesso a alguma pagina sem estar logado");
			if(object == null) {
				System.out.println("ANONIMO = "+object);
				httpResponse.sendRedirect("login.jsp");
			}
			else {
				filter.doFilter(request, response);
				System.out.println("Response ---  o Usuario "+object+" entrou na sessao");
				
			}
	
	}


 

}
