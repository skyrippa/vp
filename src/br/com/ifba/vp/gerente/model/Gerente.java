/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.model;

import br.com.ifba.vp.funcionario.model.Funcionario;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author iagobm
 */

@Entity
@Table(name="gerente")
public class Gerente extends Funcionario {
    
}
