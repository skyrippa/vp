/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionarioCaixa.dao;

import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author iagobm
 */
public interface IDaoFuncionarioCaixa extends IBaseDao<FuncionarioCaixa>{
    public abstract List <FuncionarioCaixa> findFuncionarioByCpf(String cpf);
}
