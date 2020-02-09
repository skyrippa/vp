/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.endereco.service;

import br.com.ifba.vp.infraestructure.endereco.model.Endereco;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceEndereco {
    // Salva endereco na base de dados
    public abstract Endereco saveEndereco(Endereco endereco);
    // Deleta o endereco da base de dados
    public abstract void deleteEndereco(Endereco endereco);
    // Metodo que atualiza endereco que já existe na base de dados
    public abstract Endereco  updateEndereco (Endereco endereco);
    // Metodo que retorna todos os enderecos da base de dados
    public abstract List<Endereco> getAllEndereco ();
    // Método que retorna um endereco pelo Id
    public abstract Endereco  getByIdEndereco (Long id);
}
