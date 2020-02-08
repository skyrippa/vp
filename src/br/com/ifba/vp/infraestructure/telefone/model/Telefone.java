/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.telefone.model;

import br.com.ifba.vp.infraestructure.model.AbstractEntity;
import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="telefone")
public class Telefone extends AbstractEntity implements Serializable{
    
    @NotNull
    private String numero;
    
    @NotNull
    private String ddd;
    
    @NotNull
    private String tipoTelefone;
    

    //Metodos Acessores
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTipoTelefine() {
        return tipoTelefone;
    }

    public void setTipoTelefine(String tipoTelefine) {
        this.tipoTelefone = tipoTelefine;
    }

//    public Pessoa getPessoa() {
//        return pessoa;
//    }
//
//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }
    
}
