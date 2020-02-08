/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;
import Connection.ConnectionFactory;
import br.com.ifba.vp.fornecedor.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Icaro
 */
public class FornecedorDAO {
    
    public void create(Fornecedor F){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        
        try {
            
            stm = con.prepareStatement("INSERT INTO fornecedor(razaoSocial, incricaoEstadual, telefoneForn, cnpfForn,\n" +
"    emailForn, fax , cep, estadoForn, cidade, bairroForn, ruaForn, numeroForn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, F.getRazaoSocial());
            stm.setInt(2, F.getInscricaoEstadual());
            stm.setLong(3, F.getTelefone());
            stm.setLong(4, F.getCNPJ());
            stm.setString(5, F.getEmail());
            stm.setLong(6, F.getFax());
            stm.setInt(7, F.getCEP());
            stm.setString(8, F.getEstado());
            stm.setString(9, F.getCidade());
            stm.setString(10, F.getBairro());
            stm.setString(11, F.getRua());
            stm.setInt(12, F.getNumero());
            
            stm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.fechaConexao(con, stm);
        }
        
    }
    
}
