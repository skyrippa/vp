/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.service;

import br.com.ifba.vp.caixa.dao.DaoCaixa;
import br.com.ifba.vp.caixa.dao.IDaoCaixa;
import br.com.ifba.vp.caixa.model.Caixa;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceCaixa extends IServiceCaixa {
    
    // Representa a mensagem de erro se o Professor for null;
    public final static String CAIXA_NULL = "Caixa null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String CAIXA = "O Caixa já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Caixa não existir na base de dados;
    public final static String CAIXA_NAO_EXISTE = "O Caixa NÃO existe na base de dados";
    // Representa a mensagem de erro se o Caixa for inválido;
    public final static String CAIXA_INVALIDO = "Caixa inválido";
    
    private final IDaoCaixa daoCaixa = new DaoCaixa();
    
    @Override
    public Caixa saveCaixa(Caixa caixa) {
        if(caixa == null){
            // Tratamento de exceção
            throw new BusinessException(CAIXA_NULL);
        }
        if(this.validaCaixa(caixa) == false){
            // Tratamento de exceção
           throw new BusinessException(CAIXA_INVALIDO);
        }
        if(this.caixaExistente(caixa)){
            // Tratamento de exceção
            throw new BusinessException(CAIXA);
        }
        // Salvando objeto na base de dados
        return daoCaixa.save(caixa);
    }

    @Override
    public void deleteCaixa(Caixa caixa) {
        if(caixa == null){
            // Tratamento de exceção
            throw new BusinessException(CAIXA_NULL);
        }else if(this.daoCaixa.findById(caixa.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(CAIXA_NAO_EXISTE);
        }else{
            this.daoCaixa.delete(caixa);
        }    }

    @Override
    public Caixa updateCaixa(Caixa caixa) {
        if(caixa == null) {
               // Tratamento de exceção
           throw new BusinessException(CAIXA_NULL);

        }else if(this.daoCaixa.findById(caixa.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(CAIXA_NAO_EXISTE);
            
        }else if(this.validaCaixa(caixa) == false){
               // Tratamento de exceção
               throw new BusinessException(CAIXA_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoCaixa.update(caixa);
           }
    }

    @Override
    public List<Caixa> getAllCaixa() {
            return daoCaixa.findAll();
    }

    @Override
    public Caixa getByIdCaixa(Long id) {
         return daoCaixa.findById(id);
    }
    
    private boolean validaCaixa(Caixa caixa) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(caixa == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(caixa.getDebito())) {
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

    private boolean caixaExistente(Caixa caixa) {
        List<Caixa> todos = this.daoCaixa.findAll();
        
        //Percorre a lista de caixas
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o caixa é igual ao de algum da lista
            if(caixa.getCaixa() == todos.get(i).getCaixa()){
                return true;
            }
        }
        return false;
    }
}
