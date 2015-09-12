package br.pucpr.prog4.lojaold.controllers;

import br.pucpr.prog4.lojaold.models.ClienteManager;
import br.pucpr.prog4.lojaold.models.Pessoa;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/cadastro-cliente.jsp");
        rd.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Pessoa pessoa = new Pessoa();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date dt = sd.parse(request.getParameter("dataNasc"));
            pessoa.setNome(request.getParameter("nome"));
            pessoa.setCpf(Integer.parseInt(request.getParameter("cpf")));
            pessoa.setDataNasc(dt);
            pessoa.setSexo(request.getParameter("sexo"));
            pessoa.setTipoPessoa(request.getParameter("tipoP"));
            
            } catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClienteManager manager = new ClienteManager();
        manager.cadastrar(pessoa);


    }

}
