/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.service.*;
import br.com.ifba.vp.fornecedor.dao.DaoFornecedor;
import br.com.ifba.vp.fornecedor.dao.IDaoFornecedor;
import br.com.ifba.vp.fornecedor.model.Fornecedor;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceFornecedor extends IServiceFornecedor {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String FORNECEDOR = "O Fornecedor já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Fornecedor não existir na base de dados;
    public final static String FORNECEDOR_NAO_EXISTE = "O Fornecedor NÃO existe na base de dados";
    // Representa a mensagem de erro se o Fornecedor for inválido;
    public final static String FORNECEDOR_INVALIDO = "Fornecedor inválido";
    
    private final IDaoFornecedor daoFornecedor = new DaoFornecedor();
    


    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }
        if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_INVALIDO);
        }
        if(this.fornecedorExistente(fornecedor)){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR);
        }
        // Salvando objeto na base de dados
        return daoFornecedor.save(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);
        }else{
            this.daoFornecedor.delete(fornecedor);
        }    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null) {
               // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_NULL);

        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);
            
        }else if(this.validaFornecedor(fornecedor) == false){
               // Tratamento de exceção
               throw new BusinessException(FORNECEDOR_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoFornecedor.update(fornecedor);
           }
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
            return daoFornecedor.findAll();
    }

    @Override
    public Fornecedor getByIdFornecedor(Long id) {
         return daoFornecedor.findById(id);
    }
    
    private boolean validaFornecedor(Fornecedor fornecedor) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(fornecedor == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(fornecedor.getDebito())) {
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

    private boolean fornecedorExistente(Fornecedor fornecedor) {
        List<Fornecedor> todos = this.daoFornecedor.findAll();
        
        //Percorre a lista de fornecedors
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o fornecedor é igual ao de algum da lista
            if(fornecedor.getCnpj().equals(todos.get(i).getCnpj())){
                return true;
            }
        }
        return false;
    }
}
