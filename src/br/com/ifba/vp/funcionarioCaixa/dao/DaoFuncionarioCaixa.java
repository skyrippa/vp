package br.com.ifba.vp.funcionarioCaixa.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
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
    public List<FuncionarioCaixa> findByCpfFuncionario(String cpf) {
        String query = "SELECT funcionario FROM FuncionarioCaixa funcionario WHERE UPPER(funcionario.cpf) LIKE UPPER('" + cpf +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
}
