<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="registrarVeiculo.css">
        <title>Registro Veiculo</title>
    </head>
<body>
    
<div id = "container">
   
    <h1>CADASTRAR</h1>

    <form action="insertVeiculo" method="post" name="registrandoVeiculo">
        <h2>MODELO</h2>
        <input type="text" placeholder="Digite o modelo do ve�culo..." required name="modeloCadastroVeiculo">  <br>
        <h2>PLACA</h2>
        <input type="text" placeholder="Digite a placa do ve�culo..." required name="placaCadastroVeiculo">  <br>
       <h2>COR</h2>
        <input type="text" placeholder="Digite a cor do  ve�culo..." required name="corCadastroVeiculo">  <br>
       <h2>VALOR</h2>
        <input type="number" placeholder="Digite o valor do ve�culo..." required name="valorCadastroVeiculo">  <br>
       
       
        <input class="botao" type="submit" value="Cadastrar ve�culo">
    </form>





</div>



</body>
</html>