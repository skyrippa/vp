/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.telefone.service;

import br.com.ifba.vp.infraestructure.telefone.dao.DaoTelefone;
import br.com.ifba.vp.infraestructure.telefone.dao.IDaoTelefone;
import br.com.ifba.vp.infraestructure.telefone.model.Telefone;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceTelefone extends IServiceTelefone {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String TELEFONE_NULL = "Telefone null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String TELEFONE = "O Telefone já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Telefone não existir na base de dados;
    public final static String TELEFONE_NAO_EXISTE = "O Telefone NÃO existe na base de dados";
    // Representa a mensagem de erro se o Telefone for inválido;
    public final static String TELEFONE_INVALIDO = "Telefone inválido";
    
    private final IDaoTelefone daoTelefone = new DaoTelefone();
    


    @Override
    public Telefone saveTelefone(Telefone telefone) {
        if(telefone == null){
            // Tratamento de exceção
            throw new BusinessException(TELEFONE_NULL);
        }
        if(this.validaTelefone(telefone) == false){
            // Tratamento de exceção
           throw new BusinessException(TELEFONE_INVALIDO);
        }
        if(this.telefoneExistente(telefone)){
            // Tratamento de exceção
            throw new BusinessException(TELEFONE);
        }
        // Salvando objeto na base de dados
        return daoTelefone.save(telefone);
    }

    @Override
    public void deleteTelefone(Telefone telefone) {
        if(telefone == null){
            // Tratamento de exceção
            throw new BusinessException(TELEFONE_NULL);
        }else if(this.daoTelefone.findById(telefone.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(TELEFONE_NAO_EXISTE);
        }else{
            this.daoTelefone.delete(telefone);
        }    }

    @Override
    public Telefone updateTelefone(Telefone telefone) {
        if(telefone == null) {
               // Tratamento de exceção
           throw new BusinessException(TELEFONE_NULL);

        }else if(this.daoTelefone.findById(telefone.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(TELEFONE_NAO_EXISTE);
            
        }else if(this.validaTelefone(telefone) == false){
               // Tratamento de exceção
               throw new BusinessException(TELEFONE_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoTelefone.update(telefone);
           }
    }

    @Override
    public List<Telefone> getAllTelefone() {
            return daoTelefone.findAll();
    }

    @Override
    public Telefone getByIdTelefone(Long id) {
         return daoTelefone.findById(id);
    }
    
    private boolean validaTelefone(Telefone telefone) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(telefone == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(telefone.getDebito())) {
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

    private boolean telefoneExistente(Telefone telefone) {
//        List<Telefone> todos = this.daoTelefone.findAll();
//        
//        //Percorre a lista de telefones
//        for(int i = 0; i < todos.size(); i++){
//            //Verifica se o telefone é igual ao de algum da lista
//            if(telefone.getTelefone() == todos.get(i).getTelefone()){
//                return true;
//            }
//        }
        return false;
    }
}
