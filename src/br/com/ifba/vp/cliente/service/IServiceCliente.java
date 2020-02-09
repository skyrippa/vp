/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.Cliente;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceCliente {
    // Salva cliente na base de dados
    public abstract Cliente saveCliente(Cliente cliente);
    // Deleta o cliente da base de dados
    public abstract void deleteCliente(Cliente cliente);
    // Metodo que atualiza cliente que já existe na base de dados
    public abstract Cliente  updateCliente (Cliente cliente);
    // Metodo que retorna todos os clientes da base de dados
    public abstract List<Cliente> getAllCliente ();
    // Método que retorna um cliente pelo Id
    public abstract Cliente  getByIdCliente (Long id);
}
