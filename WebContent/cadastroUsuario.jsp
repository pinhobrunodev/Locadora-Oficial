<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="cadastroUsuario.css">
    <title>Document</title>
</head>
<body>
 
<div class="container">

    <h1>CADASTRO</h1>

    <form action="insert" method="POST" name="cadastroUsuario">
        <h2>NOME</h2>
        <input  type="text" name="nomeCadastro" placeholder="Informe seu nome..." required >
        <h2>SENHA</h2>
        <input type="password" placeholder="Digite sua senha..." required name="senhaCadastro">  <br>
        <h2>USUARIO</h2>
        <input type="text" placeholder="Digite seu usuario..." required name="usuarioCadastro">  <br>
        <h2>EMAIL</h2>
        <input type="text" placeholder="Digite seu E-mail..." required name="emailCadastro">  <br>
    
       
        <input class="botao" type="submit" value="Enviar">
    </form>




</div>

</body>
</html>