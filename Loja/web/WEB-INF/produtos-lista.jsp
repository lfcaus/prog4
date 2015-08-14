<%-- 
    Document   : produtos-lista
    Created on : 14/08/2015, 18:55:50
    Author     : luiz.caus
--%>

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
        <h1>Hello World!</h1>
        <%
            List<Produto> produtos;
            produtos = (List<Produto>) request.getAttribute("produtos");
            
            for(Produto produto : produtos)
            {
            
            %>
        <div>
            <p><%= produto.getNome() %>            
                <a href="produto-detalhe?id=<%=produto.getId()%>">
                <img src="imagens/impressora.jpg" alt="Produto <%=produto.getId()%>">
            </a><p><%=produto.getPreco()%></p>   
        </div>
        <%
            }
        
        %>
    </body>
</html>
