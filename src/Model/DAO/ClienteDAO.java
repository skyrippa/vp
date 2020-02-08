/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import br.com.ifba.vp.cliente.model.Cliente;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Icaro
 */
public class ClienteDAO {
    
    public void create(Cliente C){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        
        try {
            
            stm = con.prepareStatement("INSERT INTO cliente(nomeCli, sexoCli, rgCli, cpfCli, telefoneCli,\n" +
"    cidadeCli, estadoCli, cepCli, ruaCli, bairroCli, numeroCli) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, C.getNome());
            stm.setString(2, C.getSexo());
            stm.setInt(3, C.getRG());
            stm.setLong(4, C.getCPF());
            stm.setLong(5, C.getTelefone());
            stm.setString(6, C.getCidade());
            stm.setString(7, C.getEstado());
            stm.setInt(8, C.getCEP());
            stm.setString(9, C.getRua());
            stm.setString(10, C.getBairro());
            stm.setInt(11, C.getNumero());
            
            stm.executeUpdate();
                             
            } catch (SQLException ex) {
                System.out.println("Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.fechaConexao(con, stm);
        }
        
    }
    
}
