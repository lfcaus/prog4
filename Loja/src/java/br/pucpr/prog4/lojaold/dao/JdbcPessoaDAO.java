/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaold.dao;

import br.pucpr.prog4.lojaold.models.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author luiz.caus
 */
public class JdbcPessoaDAO implements PessoaDAO{

    private Connection conexão;
    
    public void setConexão(Connection conexão){
        this.conexão = conexão;
    }
    
    @Override
    public Pessoa inserir(Pessoa pessoa) {
        String sql = "INSERT INTO PESSOA(nome, dataNasc, tipo, sexo, cpf) VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        
        try{
            ps = conexão.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setDate(2, new java.sql.Date(pessoa.getDataNasc().getTime()));
            ps.setString(3, pessoa.getTipoPessoa());
            ps.setString(4, pessoa.getSexo());
            ps.setInt(5, pessoa.getCpf());
            ps.executeUpdate();
         //   return pessoa;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
     return pessoa;   
    }
    

}
