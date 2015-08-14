package br.pucpr.prog4.lojaold.controllers;

import br.pucpr.prog4.lojaold.models.IProdutoManager;
import br.pucpr.prog4.lojaold.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoListaServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        IProdutoManager manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.obterTodos();
        
        request.setAttribute("produtos", produtos);
       RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/produtos");
       rd.forward(request, response);
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
