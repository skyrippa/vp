/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.model;

import br.com.ifba.vp.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="caixa")
public class Caixa extends AbstractEntity implements Serializable {
    
    //@Column(name="debito", length=100, nullable=false) //not null
    private double debito;
    //@Column(name="caixa", length=100, nullable=false) //not null
    private double caixa;

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = this.debito + debito;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = this.caixa + caixa;
    }
    
}
