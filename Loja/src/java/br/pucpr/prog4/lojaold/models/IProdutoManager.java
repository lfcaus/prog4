
package br.pucpr.prog4.lojaold.models;

import br.pucpr.prog4.lojaold.controllers.Produto;
import java.util.List;


public interface IProdutoManager {
    List<Produto> obterTodos();
}
