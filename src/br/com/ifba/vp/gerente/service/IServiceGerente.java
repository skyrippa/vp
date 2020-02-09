/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.service;

import br.com.ifba.vp.gerente.model.Gerente;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceGerente {
    // Salva gerente na base de dados
    public abstract Gerente saveGerente(Gerente gerente);
    // Deleta o gerente da base de dados
    public abstract void deleteGerente(Gerente gerente);
    // Metodo que atualiza gerente que já existe na base de dados
    public abstract Gerente  updateGerente (Gerente gerente);
    // Metodo que retorna todos os gerentes da base de dados
    public abstract List<Gerente> getAllGerente ();
    // Método que retorna um gerente pelo Id
    public abstract Gerente  getByIdGerente (Long id);
}
