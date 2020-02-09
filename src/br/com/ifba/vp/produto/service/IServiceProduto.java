/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.Produto;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceProduto {
    // Salva produto na base de dados
    public abstract Produto saveProduto(Produto produto);
    // Deleta o produto da base de dados
    public abstract void deleteProduto(Produto produto);
    // Metodo que atualiza produto que já existe na base de dados
    public abstract Produto  updateProduto (Produto produto);
    // Metodo que retorna todos os produtos da base de dados
    public abstract List<Produto> getAllProduto ();
    // Método que retorna um produto pelo Id
    public abstract Produto  getByIdProduto (Long id);
}
