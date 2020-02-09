/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.endereco.service;

import br.com.ifba.vp.infraestructure.endereco.service.*;
import br.com.ifba.vp.infraestructure.endereco.dao.DaoEndereco;
import br.com.ifba.vp.infraestructure.endereco.dao.IDaoEndereco;
import br.com.ifba.vp.infraestructure.endereco.model.Endereco;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceEndereco extends IServiceEndereco {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String ENDERECO_NULL = "Endereco null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String ENDERECO = "O Endereco já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Endereco não existir na base de dados;
    public final static String ENDERECO_NAO_EXISTE = "O Endereco NÃO existe na base de dados";
    // Representa a mensagem de erro se o Endereco for inválido;
    public final static String ENDERECO_INVALIDO = "Endereco inválido";
    
    private final IDaoEndereco daoEndereco = new DaoEndereco();
    


    @Override
    public Endereco saveEndereco(Endereco endereco) {
        if(endereco == null){
            // Tratamento de exceção
            throw new BusinessException(ENDERECO_NULL);
        }
        if(this.validaEndereco(endereco) == false){
            // Tratamento de exceção
           throw new BusinessException(ENDERECO_INVALIDO);
        }
        if(this.enderecoExistente(endereco)){
            // Tratamento de exceção
            throw new BusinessException(ENDERECO);
        }
        // Salvando objeto na base de dados
        return daoEndereco.save(endereco);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        if(endereco == null){
            // Tratamento de exceção
            throw new BusinessException(ENDERECO_NULL);
        }else if(this.daoEndereco.findById(endereco.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(ENDERECO_NAO_EXISTE);
        }else{
            this.daoEndereco.delete(endereco);
        }    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {
        if(endereco == null) {
               // Tratamento de exceção
           throw new BusinessException(ENDERECO_NULL);

        }else if(this.daoEndereco.findById(endereco.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(ENDERECO_NAO_EXISTE);
            
        }else if(this.validaEndereco(endereco) == false){
               // Tratamento de exceção
               throw new BusinessException(ENDERECO_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoEndereco.update(endereco);
           }
    }

    @Override
    public List<Endereco> getAllEndereco() {
            return daoEndereco.findAll();
    }

    @Override
    public Endereco getByIdEndereco(Long id) {
         return daoEndereco.findById(id);
    }
    
    private boolean validaEndereco(Endereco endereco) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(endereco == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(endereco.getDebito())) {
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

    private boolean enderecoExistente(Endereco endereco) {
//        List<Endereco> todos = this.daoEndereco.findAll();
        
        //Percorre a lista de enderecos
//        for(int i = 0; i < todos.size(); i++){
//            //Verifica se o endereco é igual ao de algum da lista
//            if(endereco.getEndereco() == todos.get(i).getEndereco()){
//                return true;
//            }
//        }
        return false;
    }
}
