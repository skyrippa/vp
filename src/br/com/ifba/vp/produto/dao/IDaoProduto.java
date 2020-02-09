/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.dao;

import br.com.ifba.vp.produto.model.Produto;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author iagobm
 */
public interface IDaoProduto extends IBaseDao<Produto>{
    public abstract List <Produto> findByNomeProduto(String nomeProduto);
    
    public abstract List <Produto> findByCodigoBarras(Integer codigoBarras);
}
