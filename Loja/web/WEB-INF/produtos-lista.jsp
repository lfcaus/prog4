<%-- 
    Document   : produtos-lista
    Created on : 14/08/2015, 18:55:50
    Author     : luiz.caus
--%>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"
          %> 
    
<%@page import="br.pucpr.prog4.lojaold.controllers.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <c:forEach var = "produto"
                   items="${produtos}">
                    <div>
                        
                        <b><h3>  <p> ${produto.nome} </h3></b>           
                <a href="produto-detalhe?id=${produto.id}">
                    <br> <img src="../imagens/${produto.nome}.jpg" alt="Produto ${produto.id}">
                </a><p>R$ ${produto.preco}</p><br>   
        </div>
            
            
        </c:forEach>
        
    </body>
</html>
