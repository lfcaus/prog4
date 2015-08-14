package br.pucpr.prog4.lojaold.models;

import br.pucpr.prog4.lojaold.controllers.Produto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ProdutoManager implements IProdutoManager{
    
    private List <Produto> produtos;
            
    public ProdutoManager(){
        
        produtos = new ArrayList<>();
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        
        p1.setId(1);
        p1.setNome("Impressora");
        p1.setPreco(1000.00);
        
        p2.setId(2);
        p2.setNome("Notebook Chrome");
        p2.setPreco(2333.90);
        
        p3.setId(3);
        p3.setNome("Notebook Samsumg");
        p3.setPreco(1999.90);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
//        Produto p1 = new Produto(1, "Impressora", 1199.99);
//        Produto p2 = new Produto(2, "Notebook Chrome", 2000.00);
//        Produto p3 = new Produto(3, "Notebook Samsung", 3300.00);
    }

    @Override
    public List<Produto> obterTodos() {
          
    }



}
