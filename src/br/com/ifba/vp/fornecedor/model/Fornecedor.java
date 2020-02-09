/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.model;

import br.com.ifba.vp.infraestructure.pessoa.model.PessoaJuridica;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="fornecedor")
public class Fornecedor extends PessoaJuridica {
    private String fax;

    // Métodos Acessores
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
