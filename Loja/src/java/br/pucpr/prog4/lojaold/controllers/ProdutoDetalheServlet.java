/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaold.controllers;

import br.pucpr.prog4.lojaold.models.IProdutoManager;
import br.pucpr.prog4.lojaold.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProdutoDetalheServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id;
        String idParam;
        idParam = request.getParameter("id");
        id = Integer.parseInt(idParam);
        IProdutoManager manager = new ProdutoManager();
        
        Produto produto = manager.obterPorId(id);
        String view;
        view = "/WEB-INF/jsp/produto-detalhe.jsp";
        RequestDispatcher rd;
        rd = request.getRequestDispatcher(view);
        rd.forward(request, response);
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
