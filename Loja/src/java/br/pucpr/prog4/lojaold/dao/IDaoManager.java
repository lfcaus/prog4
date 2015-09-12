package br.pucpr.prog4.lojaold.dao;

public interface IDaoManager 
{
    void iniciar() throws DaoException;
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
   // IClienteDao getClienteDao();
    PessoaDAO getPessoaDAO();
}
