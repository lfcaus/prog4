package br.pucpr.prog4.lojaold.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoManager implements IDaoManager {

    private Connection conexão;
    private JdbcPessoaDAO pessoaDAO;
    //JdbcClienteDao clienteDao;

    public JdbcDaoManager() {
        //    clienteDao = new JdbcClienteDao();
        pessoaDAO = new JdbcPessoaDAO();
    }

    @Override
    public void iniciar() throws DaoException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/loja";

            conexão = DriverManager.getConnection(url, "root", "");
            //   clienteDao.setConexão(conexão);
            conexão.setAutoCommit(false);
           pessoaDAO.setConexão(conexão); //?

        } catch (Exception ex) {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:"
                    + ex.getMessage());
        }
    }

    @Override
    public void encerrar() {
        try {
            if (!conexão.isClosed()) {
                conexão.close();
            }
        } catch (SQLException ex) {

        }
    }

    @Override
    public void confirmarTransação() {
        try {
            conexão.commit();

        } catch (SQLException ex) {

            throw new DaoException(ex.getMessage());
        }
    }

    @Override
    public void abortarTransação() {
           try {
            conexão.rollback();

        } catch (SQLException ex) {

            throw new DaoException(ex.getMessage());
        }
    
    }

    @Override
    public PessoaDAO getPessoaDAO() {
        return pessoaDAO;
  }

}


//    @Override
//    public IClienteDao getClienteDao() 
//    {
//        return clienteDao;
//    }

