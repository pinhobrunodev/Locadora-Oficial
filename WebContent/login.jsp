<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="login.css">
        <title>Login</title>
    </head>
<body>
  
<div id = "container">
    <h1>LOGIN</h1>
    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" id="Layer_1" width="300" style="enable-background:new 0 0 64 64;" version="1.1" viewBox="0 0 64 64" xml:space="preserve"><style type="text/css">
        .st0{fill:#1379C2;}
        .st1{fill:#358DCC;}
        .st2{fill-rule:evenodd;clip-rule:evenodd;fill:#3FB754;}
        .st3{fill-rule:evenodd;clip-rule:evenodd;fill:#CCCCCC;}
        .st4{fill:#5D5E61;}
        .st5{fill:#924F34;}
        .st6{fill:#E6E6E6;}
        .st7{fill:#0F8C7E;}
        .st8{fill-rule:evenodd;clip-rule:evenodd;fill:#E6E6E6;}
        .st9{fill-rule:evenodd;clip-rule:evenodd;fill:#E6E6E6;stroke:#000000;stroke-width:0.4799;stroke-miterlimit:2.6131;}
        .st10{fill:#823B1F;}
        .st11{fill:#FFC810;}
        .st12{fill-rule:evenodd;clip-rule:evenodd;fill:#924F34;}
        .st13{fill:#E04538;}
        .st14{fill-rule:evenodd;clip-rule:evenodd;}
        .st15{fill-rule:evenodd;clip-rule:evenodd;fill:#FFC810;}
        .st16{fill-rule:evenodd;clip-rule:evenodd;fill:#E4E7E9;}
        .st17{fill:#3FB754;}
        .st18{fill-rule:evenodd;clip-rule:evenodd;fill:#5D5E61;}
        .st19{fill:#C92B1C;}
        .st20{fill:#666666;}
        .st21{fill:#FFD95E;}
        .st22{fill:#4D4D4D;}
        .st23{fill-rule:evenodd;clip-rule:evenodd;fill:#0F8C7E;}
        .st24{fill:#999999;}
        .st25{fill:#CCCCCC;}
        .st26{fill-rule:evenodd;clip-rule:evenodd;fill:#358DCC;}
        .st27{fill-rule:evenodd;clip-rule:evenodd;fill:#823B1F;}
    </style><g><path class="st17" d="M1,43.5V13.9c0-1.2,1-2.3,2.2-2.3h19h30.1c0.9,0,1.7,0.6,2.1,1.4l8.3,14.8c0.2,0.4,0.3,0.9,0.3,1.3   c0,4.8,0,9.6,0,14.5c0,1.2-1,2.2-2.2,2.2v0c-19.2,0-38.4,0-57.6,0C2,45.8,1,44.8,1,43.5L1,43.5z M43.1,16.1v10.7h14l-6-10.7H43.1   L43.1,16.1z M38.6,26.8V16.1H24.4v10.7H38.6L38.6,26.8z M19.9,26.8V16.1H5.5v10.7H19.9L19.9,26.8z"/><path d="M0,43.5V13.9c0-1.8,1.4-3.2,3.2-3.2h19h30.1c1.3,0,2.4,0.8,2.9,1.9l8.3,14.7c0.3,0.6,0.4,1.2,0.4,1.8h0l0,7.8l0,6.6h0   c0,2-1.5,3.2-3.2,3.2H3.2C1.4,46.8,0,45.3,0,43.5L0,43.5z M1.9,13.9v29.7c0,0.7,0.6,1.3,1.3,1.3c19.2,0,38.4,0,57.6,0   c0.7,0,1.3-0.6,1.3-1.3h0l0-6.6l0-7.8h0c0-0.3,0-0.6-0.2-0.9l-8.3-14.8c-0.3-0.5-0.6-0.9-1.2-0.9H22.2h-19   C2.5,12.6,1.9,13.2,1.9,13.9L1.9,13.9z M44.1,17.1v8.8h11.3l-5-8.8H44.1L44.1,17.1z M42.1,26.8V16.1v-1h1H51l0.8,0.5l6,10.7   l0.8,1.4h-1.7h-14h-1V26.8L42.1,26.8z M37.6,25.9v-8.8H25.4v8.8H37.6L37.6,25.9z M39.6,16.1v10.7v1h-1H24.4h-1v-1V16.1v-1h1h14.2h1   V16.1L39.6,16.1z M19,25.9v-8.8H6.4v8.8H19L19,25.9z M20.9,16.1v10.7v1h-1H5.5h-1v-1V16.1v-1h1h14.5h1V16.1L20.9,16.1z"/><path class="st18" d="M16.5,37.3c-4.2,0-7.5,3.4-7.5,7.5c0,4.2,3.4,7.5,7.5,7.5c4.2,0,7.5-3.4,7.5-7.5C24,40.7,20.6,37.3,16.5,37.3   L16.5,37.3z"/><path d="M16.5,38.3c-3.6,0-6.6,2.9-6.6,6.6c0,3.6,2.9,6.6,6.6,6.6c3.6,0,6.6-2.9,6.6-6.6C23,41.2,20.1,38.3,16.5,38.3L16.5,38.3z    M16.5,36.4c4.7,0,8.5,3.8,8.5,8.5c0,4.7-3.8,8.5-8.5,8.5c-4.7,0-8.5-3.8-8.5-8.5C8,40.2,11.8,36.4,16.5,36.4L16.5,36.4z"/><path class="st8" d="M16.5,40.3c-2.5,0-4.5,2-4.5,4.5c0,2.5,2,4.5,4.5,4.5s4.5-2,4.5-4.5C21,42.4,18.9,40.3,16.5,40.3L16.5,40.3z"/><path d="M16.5,41.3c-2,0-3.5,1.6-3.5,3.5c0,2,1.6,3.5,3.5,3.5c2,0,3.5-1.6,3.5-3.5C20,42.9,18.4,41.3,16.5,41.3L16.5,41.3z    M16.5,39.4c3,0,5.5,2.5,5.5,5.5c0,2.8-2.6,5.5-5.5,5.5c-3,0-5.5-2.5-5.5-5.5C11,41.8,13.4,39.4,16.5,39.4L16.5,39.4z"/><path class="st18" d="M47.5,37.3c-4.2,0-7.5,3.4-7.5,7.5c0,4.2,3.4,7.5,7.5,7.5s7.5-3.4,7.5-7.5C55.1,40.7,51.7,37.3,47.5,37.3   L47.5,37.3z"/><path d="M47.5,38.3c-3.6,0-6.6,2.9-6.6,6.6c0,3.6,2.9,6.6,6.6,6.6c3.6,0,6.6-2.9,6.6-6.6C54.1,41.2,51.2,38.3,47.5,38.3L47.5,38.3z    M47.5,36.4c4.7,0,8.5,3.8,8.5,8.5c0,4.7-3.8,8.5-8.5,8.5c-4.7,0-8.5-3.8-8.5-8.5C39.1,40.2,42.9,36.4,47.5,36.4L47.5,36.4z"/><path class="st8" d="M47.5,40.3c-2.5,0-4.5,2-4.5,4.5c0,2.5,2,4.5,4.5,4.5s4.5-2,4.5-4.5C52.1,42.4,50,40.3,47.5,40.3L47.5,40.3z"/><path d="M47.5,41.3c-2,0-3.5,1.6-3.5,3.5c0,2,1.6,3.5,3.5,3.5c2,0,3.5-1.6,3.5-3.5C51.1,42.9,49.5,41.3,47.5,41.3L47.5,41.3z    M47.5,39.4c3,0,5.5,2.5,5.5,5.5c0,3-2.5,5.5-5.5,5.5c-3,0-5.5-2.5-5.5-5.5C42.1,41.8,44.5,39.4,47.5,39.4L47.5,39.4z"/><polygon class="st8" points="19.9,26.8 19.9,16.1 5.5,16.1 5.5,26.8 19.9,26.8  "/><path d="M19,25.9v-8.8H6.4v8.8H19L19,25.9z M20.9,16.1v10.7v1h-1H5.5h-1v-1V16.1v-1h1h14.5h1V16.1L20.9,16.1z"/><polygon class="st8" points="24.4,16.1 24.4,26.8 38.6,26.8 38.6,16.1 24.4,16.1  "/><path d="M25.4,17.1v8.8h12.2v-8.8H25.4L25.4,17.1z M23.5,26.8V16.1v-1h1h14.2h1v1v10.7v1h-1H24.4h-1V26.8L23.5,26.8z"/><polygon class="st8" points="43.1,16.1 43.1,26.8 57.1,26.8 51,16.1 43.1,16.1  "/><path d="M44.1,17.1v8.8h11.3l-5-8.8H44.1L44.1,17.1z M42.1,26.8V16.1v-1h1H51l0.8,0.5l6,10.7l0.8,1.4h-1.7h-14h-1V26.8L42.1,26.8z"/></g></svg>

    <form action="login" method="POST" name="loginPage">
        <h2>Usuario</h2>
        <input type="text" placeholder="Digite seu usuario..." required name="usuarioLogin"> <br>
        <h2>Senha</h2>
        <input type="password" placeholder="Digite sua senha..." required name="senhaLogin">  <br>
       
        <input class="botao" type="submit" value="Entrar" >
    </form>

    <button class = "botao">
        <a href="cadastroUsuario.jsp">Cadastrar</a>
    </button>



</div>



</body>
</html>