/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionarioCaixa.service;

import br.com.ifba.vp.funcionarioCaixa.service.*;
import br.com.ifba.vp.funcionarioCaixa.dao.DaoFuncionarioCaixa;
import br.com.ifba.vp.funcionarioCaixa.dao.IDaoFuncionarioCaixa;
import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceFuncionarioCaixa extends IServiceFuncionarioCaixa {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String FUNCIONARIO_CAIXA_NULL = "FuncionarioCaixa null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String FUNCIONARIO_CAIXA = "O FuncionarioCaixa já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o FuncionarioCaixa não existir na base de dados;
    public final static String FUNCIONARIO_CAIXA_NAO_EXISTE = "O FuncionarioCaixa NÃO existe na base de dados";
    // Representa a mensagem de erro se o FuncionarioCaixa for inválido;
    public final static String FUNCIONARIO_CAIXA_INVALIDO = "FuncionarioCaixa inválido";
    
    private final IDaoFuncionarioCaixa daoFuncionarioCaixa = new DaoFuncionarioCaixa();
    


    @Override
    public FuncionarioCaixa saveFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        if(funcionarioCaixa == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_CAIXA_NULL);
        }
        if(this.validaFuncionarioCaixa(funcionarioCaixa) == false){
            // Tratamento de exceção
           throw new BusinessException(FUNCIONARIO_CAIXA_INVALIDO);
        }
        if(this.funcionarioCaixaExistente(funcionarioCaixa)){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_CAIXA);
        }
        // Salvando objeto na base de dados
        return daoFuncionarioCaixa.save(funcionarioCaixa);
    }

    @Override
    public void deleteFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        if(funcionarioCaixa == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_CAIXA_NULL);
        }else if(this.daoFuncionarioCaixa.findById(funcionarioCaixa.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_CAIXA_NAO_EXISTE);
        }else{
            this.daoFuncionarioCaixa.delete(funcionarioCaixa);
        }    }

    @Override
    public FuncionarioCaixa updateFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        if(funcionarioCaixa == null) {
           // Tratamento de exceção
           throw new BusinessException(FUNCIONARIO_CAIXA_NULL);

        }else if(this.daoFuncionarioCaixa.findById(funcionarioCaixa.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_CAIXA_NAO_EXISTE);
            
        }else if(this.validaFuncionarioCaixa(funcionarioCaixa) == false){
               // Tratamento de exceção
               throw new BusinessException(FUNCIONARIO_CAIXA_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoFuncionarioCaixa.update(funcionarioCaixa);
           }
    }

    @Override
    public List<FuncionarioCaixa> getAllFuncionarioCaixa() {
            return daoFuncionarioCaixa.findAll();
    }

    @Override
    public FuncionarioCaixa getByIdFuncionarioCaixa(Long id) {
         return daoFuncionarioCaixa.findById(id);
    }
    
    private boolean validaFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(funcionarioFuncionarioCaixa == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(funcionarioFuncionarioCaixa.getDebito())) {
//            return false;
//        }
//        
//        if(util.isEmpty(projetoPesquisa.getCampus())) {
//            return false;
//        }
//        
//        if(util.isEmpty(projetoPesquisa.getSubArea())) {
//            return false;
//        }
//        if(util.isEmpty(projetoPesquisa.getLinhaPesquisa())) {
//            return false;
//        }
//        
//        if(projetoPesquisa.getDataInicio() == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(projetoPesquisa.getViabilidadeTec())) {
//            return false;
//        }
        
        return true;
    }

    private boolean funcionarioCaixaExistente(FuncionarioCaixa funcionarioCaixa) {
        List<FuncionarioCaixa> todos = this.daoFuncionarioCaixa.findAll();
        
        //Percorre a lista de funcionarioCaixas
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o funcionarioCaixa é igual ao de algum da lista
            if(funcionarioCaixa.getCpf().equals(todos.get(i).getCpf())){
                return true;
            }
        }
        return false;
    }
}
