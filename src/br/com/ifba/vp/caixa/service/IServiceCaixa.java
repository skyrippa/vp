/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.service;

import br.com.ifba.vp.caixa.model.Caixa;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceCaixa {
    // Salva caixa na base de dados
    public abstract Caixa saveCaixa(Caixa caixa);
    // Deleta o caixa da base de dados
    public abstract void deleteCaixa(Caixa caixa);
    // Metodo que atualiza caixa que já existe na base de dados
    public abstract Caixa  updateCaixa (Caixa caixa);
    // Metodo que retorna todos os caixas da base de dados
    public abstract List<Caixa> getAllCaixa ();
    // Método que retorna um caixa pelo Id
    public abstract Caixa getByIdCaixa (Long id);
}
