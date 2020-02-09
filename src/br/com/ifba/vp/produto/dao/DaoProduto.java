package br.com.ifba.vp.produto.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.produto.model.Produto;
import java.util.List;
/**
 *
 * @author iagobm
 */
public class DaoProduto extends BaseDao<Produto> implements IDaoProduto {

    // construtor
    public DaoProduto(){
        super();
    }
    
    @Override
    public List <Produto> findByNomeProduto(String nomeProduto){
        String query = "select p from Produto p where upper(p.nomeProduto) like upper('" + nomeProduto +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Produto> findByCodigoBarras(Integer codigoBarras) {
        String query = "select p from Produto p where upper(p.codigoBarras) like upper('" + codigoBarras +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
}
