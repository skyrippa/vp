/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.service;

import br.com.ifba.vp.gerente.dao.DaoGerente;
import br.com.ifba.vp.gerente.dao.IDaoGerente;
import br.com.ifba.vp.gerente.model.Gerente;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceGerente extends IServiceGerente {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String GERENTE_NULL = "Gerente null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String GERENTE = "O Gerente já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Gerente não existir na base de dados;
    public final static String GERENTE_NAO_EXISTE = "O Gerente NÃO existe na base de dados";
    // Representa a mensagem de erro se o Gerente for inválido;
    public final static String GERENTE_INVALIDO = "Gerente inválido";
    
    private final IDaoGerente daoGerente = new DaoGerente();
    


    @Override
    public Gerente saveGerente(Gerente gerente) {
        if(gerente == null){
            // Tratamento de exceção
            throw new BusinessException(GERENTE_NULL);
        }
        if(this.validaGerente(gerente) == false){
            // Tratamento de exceção
           throw new BusinessException(GERENTE_INVALIDO);
        }
        if(this.gerenteExistente(gerente)){
            // Tratamento de exceção
            throw new BusinessException(GERENTE);
        }
        // Salvando objeto na base de dados
        return daoGerente.save(gerente);
    }

    @Override
    public void deleteGerente(Gerente gerente) {
        if(gerente == null){
            // Tratamento de exceção
            throw new BusinessException(GERENTE_NULL);
        }else if(this.daoGerente.findById(gerente.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(GERENTE_NAO_EXISTE);
        }else{
            this.daoGerente.delete(gerente);
        }    
    }

    @Override
    public Gerente updateGerente(Gerente gerente) {
        if(gerente == null) {
               // Tratamento de exceção
           throw new BusinessException(GERENTE_NULL);

        }else if(this.daoGerente.findById(gerente.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(GERENTE_NAO_EXISTE);
            
        }else if(this.validaGerente(gerente) == false){
               // Tratamento de exceção
               throw new BusinessException(GERENTE_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoGerente.update(gerente);
        }
    }

    @Override
    public List<Gerente> getAllGerente() {
            return daoGerente.findAll();
    }

    @Override
    public Gerente getByIdGerente(Long id) {
        return daoGerente.findById(id);
    }
    
    private boolean validaGerente(Gerente gerente) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(gerente == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(gerente.getDebito())) {
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

    private boolean gerenteExistente(Gerente gerente) {
        List<Gerente> todos = this.daoGerente.findAll();
        
        //Percorre a lista de gerentes
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o gerente é igual ao de algum da lista
            if(gerente.getCpf().equals(todos.get(i).getCpf())){
                return true;
            }
        }
        return false;
    }
}
