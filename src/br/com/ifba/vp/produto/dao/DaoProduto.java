package br.com.ifba.vp.produto.dao;

import br.com.ifba.vp.produto.dao.*;
import br.com.ifba.vp.infraestructure.telefone.dao.*;
import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.produto.model.Produto;
import javax.persistence.Query;
/**
 *
 * @author iagobm
 */
public class DaoProduto extends BaseDao<Produto> implements IDaoProduto {
//    private String cliente;

    // construtor
    public DaoProduto(){
        super();
    }
    
    // Metodos Acessores
//    public String getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(String cliente) {
//        this.cliente = cliente;
//    }
    
    // Métodos sobrescritos
//    @Override
//    public boolean saveCliente(Cliente cliente) {
//        this.setCliente("SELECT c.id FROM Cliente AS c WHERE c.ano=:ano "
//                + "OR (c.nome=:nome AND c.matricula=:matricula)");
//        
//        // adicionando cliente na query
//        Query query = entityManager.createQuery(this.getCliente());
//        // inserindo os dados
//        query.setParameter("nome", cliente.getNome());
//        query.setParameter("sexo", cliente.getSexo());
//        query.setParameter("estado_civil", cliente.getEstadoCivil());
//        query.setParameter("data_nascimento", cliente.getDataNascimento());
//        query.setParameter("cpf", cliente.getCpf());
//        query.setParameter("rg", cliente.getRg());
//        query.setParameter("data_expedicao", cliente.getDataExpedicao());
//        query.setParameter("orgao_expedidor", cliente.getOrgaoExpedidor());
//        query.setParameter("nacionalidade", cliente.getNacionalidade());
//        query.setParameter("naturalidade", cliente.getNaturalidade());
//        
//        if (!query.getResultList().isEmpty()) {
//            // foi encontrado patente correspondente - erro
//            return false;
//        }
//        try {
//            this.save(cliente);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
