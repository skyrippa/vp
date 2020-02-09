/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.Fornecedor;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceFornecedor {
    // Salva fornecedor na base de dados
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    // Deleta o fornecedor da base de dados
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    // Metodo que atualiza fornecedor que já existe na base de dados
    public abstract Fornecedor  updateFornecedor (Fornecedor fornecedor);
    // Metodo que retorna todos os fornecedors da base de dados
    public abstract List<Fornecedor> getAllFornecedor ();
    // Método que retorna um fornecedor pelo Id
    public abstract Fornecedor  getByIdFornecedor (Long id);
}
