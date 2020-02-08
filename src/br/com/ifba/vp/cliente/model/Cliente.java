/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.model;

import br.com.ifba.vp.infraestructure.pessoa.model.PessoaFisica;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="cliente")
public class Cliente extends PessoaFisica {
    
}
