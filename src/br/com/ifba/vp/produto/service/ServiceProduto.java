/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.dao.DaoProduto;
import br.com.ifba.vp.produto.dao.IDaoProduto;
import br.com.ifba.vp.produto.model.Produto;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author iagobm
 */
public class ServiceProduto extends IServiceProduto {
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String PRODUTO_NULL = "Produto null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String PRODUTO = "O Produto já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Produto não existir na base de dados;
    public final static String PRODUTO_NAO_EXISTE = "O Produto NÃO existe na base de dados";
    // Representa a mensagem de erro se o Produto for inválido;
    public final static String PRODUTO_INVALIDO = "Produto inválido";
    
    private final IDaoProduto daoProduto = new DaoProduto();
    


    @Override
    public Produto saveProduto(Produto produto) {
        if(produto == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }
        if(this.validaProduto(produto) == false){
            // Tratamento de exceção
           throw new BusinessException(PRODUTO_INVALIDO);
        }
        if(this.produtoExistente(produto)){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO);
        }
        // Salvando objeto na base de dados
        return daoProduto.save(produto);
    }

    @Override
    public void deleteProduto(Produto produto) {
        if(produto == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }else if(this.daoProduto.findById(produto.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NAO_EXISTE);
        }else{
            this.daoProduto.delete(produto);
        }   
    }

    @Override
    public Produto updateProduto(Produto produto) {
        if(produto == null) {
               // Tratamento de exceção
           throw new BusinessException(PRODUTO_NULL);

        }else if(this.daoProduto.findById(produto.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(PRODUTO_NAO_EXISTE);
            
        }else if(this.validaProduto(produto) == false){
               // Tratamento de exceção
               throw new BusinessException(PRODUTO_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoProduto.update(produto);
        }
    }

    @Override
    public List<Produto> getAllProduto() {
            return daoProduto.findAll();
    }

    @Override
    public Produto getByIdProduto(Long id) {
         return daoProduto.findById(id);
    }
    
    private boolean validaProduto(Produto produto) {
//        StringUtil util = StringUtil.getInstance();
//                /*PRECISA IMPLEMENTAR
//                  txtEmail.getText().equals("")
//                  txtTelefone.getText().equals("")
//                  txtGrupoPesquisa.getText().equals("")
//                  txtLocalDesenvolvimento.getText().equals("")
//                  txtViabilidadeTecnica.getText().equals("")
//                  txtFonte.getText().equals("")*/
//        if(produto == null) {
//            return false;
//        }
//        
//        if(util.isEmpty(produto.getDebito())) {
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

    private boolean produtoExistente(Produto produto) {
        List<Produto> todos = this.daoProduto.findAll();
        
        //Percorre a lista de produtos
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o produto é igual ao de algum da lista
            if(produto.getCodigoBarras() == todos.get(i).getCodigoBarras()){
                return true;
            }
        }
        return false;
    }
    
    public List <Produto> findByNomeProduto(String nomeProduto) {
        return daoProduto.findByNomeProduto(nomeProduto);
    }
    public List <Produto> findByCodigoBarras(Integer codigoBarras) {
        return daoProduto.findByCodigoBarras(codigoBarras);
    }
}
