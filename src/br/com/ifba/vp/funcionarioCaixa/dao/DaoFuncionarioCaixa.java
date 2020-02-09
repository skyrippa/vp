package br.com.ifba.vp.funcionarioCaixa.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import javax.persistence.EntityManager;
import java.util.List;
/**
 *
 * @author iagobm
 */
public class DaoFuncionarioCaixa extends BaseDao<FuncionarioCaixa> implements IDaoFuncionarioCaixa {

    // construtor
    public DaoFuncionarioCaixa(){
        super();
    }

    @Override
    public List<FuncionarioCaixa> findFuncionarioByCpf(String cpf) {
        // dar uma olhada nessa bagunça
        String query = "select f from Pessoa f where f.CPF like upper('" + cpf +"%')";
        EntityManager entityManager = null;
        return entityManager.createQuery(query).getResultList();
    }
}
