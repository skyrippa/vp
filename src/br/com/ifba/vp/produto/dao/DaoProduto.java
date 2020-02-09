package br.com.ifba.vp.produto.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.produto.model.Produto;
/**
 *
 * @author iagobm
 */
public class DaoProduto extends BaseDao<Produto> implements IDaoProduto {

    // construtor
    public DaoProduto(){
        super();
    }
}
