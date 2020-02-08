package br.com.ifba.vp.cliente.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.cliente.model.Cliente;

/**
 *
 * @author iagobm
 */
public class DaoCliente extends BaseDao<Cliente> implements IDaoCliente {

    // construtor
    public DaoCliente(){
        super();
    }
}
