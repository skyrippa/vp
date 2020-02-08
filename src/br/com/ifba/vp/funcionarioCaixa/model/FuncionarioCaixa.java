/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionarioCaixa.model;

import br.com.ifba.vp.funcionario.model.Funcionario;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="funcionario_caixa")
public class FuncionarioCaixa extends Funcionario {
    
    @Column(name="especializacao", length=100, nullable=false) //not null
    private String especialização;

    // Métodos Acessores
    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }
}
