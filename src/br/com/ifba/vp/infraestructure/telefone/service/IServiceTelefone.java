/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.telefone.service;

import br.com.ifba.vp.infraestructure.telefone.model.Telefone;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceTelefone {
    // Salva telefone na base de dados
    public abstract Telefone saveTelefone(Telefone telefone);
    // Deleta o telefone da base de dados
    public abstract void deleteTelefone(Telefone telefone);
    // Metodo que atualiza telefone que já existe na base de dados
    public abstract Telefone  updateTelefone (Telefone telefone);
    // Metodo que retorna todos os telefones da base de dados
    public abstract List<Telefone> getAllTelefone ();
    // Método que retorna um telefone pelo Id
    public abstract Telefone  getByIdTelefone (Long id);
}
