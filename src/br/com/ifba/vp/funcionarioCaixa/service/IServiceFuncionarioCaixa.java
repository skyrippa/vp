/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionarioCaixa.service;

import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import java.util.List;

/**
 *
 * @author iagobm
 */
public abstract class IServiceFuncionarioCaixa {
    // Salva funcionarioCaixa na base de dados
    public abstract FuncionarioCaixa saveFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa);
    // Deleta o funcionarioCaixa da base de dados
    public abstract void deleteFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa);
    // Metodo que atualiza funcionarioCaixa que já existe na base de dados
    public abstract FuncionarioCaixa  updateFuncionarioCaixa (FuncionarioCaixa funcionarioCaixa);
    // Metodo que retorna todos os funcionarioCaixas da base de dados
    public abstract List<FuncionarioCaixa> getAllFuncionarioCaixa ();
    // Método que retorna um funcionarioCaixa pelo Id
    public abstract FuncionarioCaixa  getByIdFuncionarioCaixa (Long id);
}
