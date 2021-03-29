<%@page import="beans.VeiculoBeans"%>
<%@page import="dao.Usuario_VeiculoDAO"%>
<%@page import="beans.UsuarioBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="beans.Usuario_VeiculoBeans"%>
  <%@page import="beans.UsuarioBeans"%>
        
<!DOCTYPE html>
<html lang="PT-BR">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="alugarVeiculo.css">
<title>Lista de Veiculos</title>
</head>
<body>



<%



UsuarioBeans user = new  UsuarioBeans();

Usuario_VeiculoDAO uvd = new Usuario_VeiculoDAO();


Object object = session.getAttribute("logado");


user.setUsuario(object);

uvd.selecionarUsuarioPeloSession(user);

request.setAttribute("idUser", user.getId());
request.setAttribute("nome", user.getNome());
request.setAttribute("senha", user.getSenha());
request.setAttribute("usuario", user.getUsuario());
request.setAttribute("email", user.getEmail());

VeiculoBeans veiculo = new VeiculoBeans();




%>



	<div id="container">
		<div id="header">
			<h1>Veiculos cadastrados</h1>
			<button>
				<a href="menuUsuario.jsp">Voltar</a>
			</button>
		</div>
		<table>

			<thead>
				<tr>
					<th>NOME</th>
					<th>E-MAIL</th>
					<th>CODIGO VEÍCULO</th>
					<th>MODELO</th>
					<th>PLACA</th>
					<th>COR</th>
					<th>VALOR</th>
					<th>OPÇÃO</th>
					
				</tr>

			</thead>
			
			

			<tbody>

			
                        <tr>
                            <td><%out.print(request.getAttribute("nome"));%></td>
                            <td><%out.print(request.getAttribute("email"));%></td>
                            <td><%out.print(request.getAttribute("idV"));%></td>
                            <td><%out.print(request.getAttribute("modelo"));%></td>
                            <td><%out.print(request.getAttribute("placa"));%></td>
                           	<td><%out.print(request.getAttribute("cor"));%></td>
                           	<td><%out.print(request.getAttribute("valor"));%></td>
                           	<td>
                           	<button id=alugar>
                           	<a href="sucesso?idVeiculo=<%=request.getAttribute("idV")%>&idUsuario=<%=request.getAttribute("idUser") %>"> Confirmar </a>
                           	</button>
                           	</td>
                         
                  
                            
                           </tr>
                  
                            
                       
                  
                          

			
			
			
			</tbody>


		</table>


	</div>
</body>
</html>