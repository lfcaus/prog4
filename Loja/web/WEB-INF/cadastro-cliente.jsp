<%-- 
    Document   : cadastro-cliente
    Created on : 28/08/2015, 20:06:52
    Author     : luiz.caus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ClienteServlet" method="post">
        <h1>Cadastro Cliente</h1>
        <p>Tipo pessoa :</p>
        <p><input type="radio" name="tipoP" value="fisica"/>Pessoa física</p>
        <p><input type="radio" name="tipoP" value="juridica"/>Pessoa Jurídica</p>
        <p>Nome :<input type="text" name="nome" id="nome"/></p>
        <p>CPF : <input type="text" name="cpf" id="cpf"/></p>
        <p>Data de nascimento :<input type="dataNasc" name="dataNasc" id="dataNasc"/> </p>
        <p>Sexo:</p>
        <p><input type="radio" name="sexo" id="sexo" value="masc"/>Masculino</p>
        <p><input type="radio" name="sexo" id="sexo" value="fem"/>Feminino</p>
        <p><input type="submit" value="Cadastrar"/></p>
        </form>
    </body>
</html>
