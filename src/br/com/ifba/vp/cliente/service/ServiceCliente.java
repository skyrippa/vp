/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.dao.DaoCliente;
import br.com.ifba.vp.cliente.dao.IDaoCliente;
import br.com.ifba.vp.cliente.model.Cliente;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceCliente extends IServiceCliente {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String CLIENTE_NULL = "Cliente null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String CLIENTE = "O Cliente já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Cliente não existir na base de dados;
    public final static String CLIENTE_NAO_EXISTE = "O Cliente NÃO existe na base de dados";
    // Representa a mensagem de erro se o Cliente for inválido;
    public final static String CLIENTE_INVALIDO = "Cliente inválido";
    
    private final IDaoCliente daoCliente = new DaoCliente();

    @Override
    public Cliente saveCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }
        if(this.validaCliente(cliente) == false){
            // Tratamento de exceção
           throw new BusinessException(CLIENTE_INVALIDO);
        }
        if(this.clienteExistente(cliente)){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE);
        }
        // Salvando objeto na base de dados
        return daoCliente.save(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }else if(this.daoCliente.findById(cliente.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NAO_EXISTE);
        }else{
            this.daoCliente.delete(cliente);
        }    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        if(cliente == null) {
               // Tratamento de exceção
           throw new BusinessException(CLIENTE_NULL);

        }else if(this.daoCliente.findById(cliente.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(CLIENTE_NAO_EXISTE);
            
        }else if(this.validaCliente(cliente) == false){
               // Tratamento de exceção
               throw new BusinessException(CLIENTE_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoCliente.update(cliente);
           }
    }

    @Override
    public List<Cliente> getAllCliente() {
            return daoCliente.findAll();
    }

    @Override
    public Cliente getByIdCliente(Long id) {
         return daoCliente.findById(id);
    }
    
    private boolean validaCliente(Cliente cliente) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(cliente == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(cliente.getDebito())) {
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

    private boolean clienteExistente(Cliente cliente) {
        List<Cliente> todos = this.daoCliente.findAll();
        
        //Percorre a lista de clientes
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o cliente é igual ao de algum da lista
            if(cliente.getCpf().equals(todos.get(i).getCpf())){
                return true;
            }
        }
        return false;
    }
}
