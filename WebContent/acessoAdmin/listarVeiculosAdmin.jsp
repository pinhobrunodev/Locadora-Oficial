<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="beans.VeiculoBeans"%>


<%
ArrayList<VeiculoBeans> listar = (ArrayList<VeiculoBeans>) request.getAttribute("registros");
%>




<!DOCTYPE html>
<html lang="PT-BR">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="listarVeiculosAdmin.css">
<title>Lista de Veiculos</title>
</head>
<body>



	<div id="container">
		<div id="header">
			<h1>Veiculos cadastrados</h1>
			<button>
				<a href="menuAdmin.jsp">Voltar</a>
			</button>
		</div>
		<table>

			<thead>
				<tr>
					<th>CODIGO</th>
					<th>MODELO</th>
					<th>PLACA</th>
					<th>COR</th>
					<th>VALOR</th>
					<th>OPÇÕES</th>
				</tr>

			</thead>
			
			

			<tbody>

					<% for(int i = 0;i<listar.size();i++){ %>
                        <tr>
                             <td><%=listar.get(i).getId()%></td>
                            <td><%=listar.get(i).getModelo()%></td>
                            <td><%=listar.get(i).getPlaca()%></td>
                            <td><%=listar.get(i).getCor()%></td>
                             <td><%=listar.get(i).getValor()%></td>
                            <td><button id="excluir"><a href="delete?id=<%=listar.get(i).getId()%>" >Excluir</a></button>
                           <button id="edit"><a href="select?id=<%=listar.get(i).getId()%>" >Editar</a></button></td>
                            
                       
                  
                            </tr>
                            <%} %> 

			
			
			
			</tbody>


		</table>


	</div>
</body>
</html>