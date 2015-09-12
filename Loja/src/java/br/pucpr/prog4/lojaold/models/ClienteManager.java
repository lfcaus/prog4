
package br.pucpr.prog4.lojaold.models;

import br.pucpr.prog4.lojaold.dao.IDaoManager;
import br.pucpr.prog4.lojaold.dao.JdbcDaoManager;
import br.pucpr.prog4.lojaold.dao.PessoaDAO;


public class ClienteManager implements IClienteManager{

    @Override
    public Pessoa cadastrar(Pessoa pessoa) {
        
        IDaoManager manager = new JdbcDaoManager();
        
        try{
            manager.iniciar();
            PessoaDAO dao = manager.getPessoaDAO();
            Pessoa p = dao.inserir(pessoa);
            manager.confirmarTransação();
            manager.encerrar();
            return p;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        return pessoa;
        //regras de negócio - validações 
   }
    
}
