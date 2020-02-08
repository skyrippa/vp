/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import br.com.ifba.vp.produto.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Icaro
 */
public class ProdutosDAO {
    
    public void create(Produtos P){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        
        try {
            
            stm = con.prepareStatement("INSERT INTO produto(nomePro, lote, preco, codigoDeBarra, dataValidade,\n" +
            "    genero, secao ) VALUES(?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, P.getNomeProduto());
            stm.setInt(2, P.getLote());
            stm.setDouble(3, P.getPreco());
            stm.setInt(4, P.getCodigoBarras());
            stm.setString(5, P.getDataValidade());
            stm.setString(6, P.getGenero());
            stm.setInt(7, P.getSecao());
            
            stm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.fechaConexao(con, stm);
        }
        
    }
    
    public Produtos read(int chave){
        
        String sql = "SELECT * FROM produto where codigoDeBarra = ?";
        Produtos P = new Produtos();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            
            stm = con.prepareStatement(sql);
            stm.setInt(1, chave);
            rs = stm.executeQuery();
            
            while(rs.next()){
     
                P.setNomeProduto(rs.getString("nomePro"));
                P.setSecao(rs.getInt("lote"));
                P.setPreco(rs.getDouble("preco"));
                
            }  
            
        } catch (SQLException ex) {
            System.out.println("Erro ao ler!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm, rs);
        }
        
        return P;
        
    }
    
    public Produtos Vender(int chave){
        String sql = "SELECT * FROM produto where codigoDeBarra = ?";
        Produtos P = new Produtos();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            
            stm = con.prepareStatement(sql);
            stm.setInt(1, chave);
            rs = stm.executeQuery();
            
            while(rs.next()){
     
                P.setNomeProduto(rs.getString("nomePro"));
                P.setDataValidade(rs.getString("dataValidade"));
                P.setLote(rs.getInt("secao"));
                P.setPreco(rs.getDouble("preco"));
                
            }  
            
        } catch (SQLException ex) {
            System.out.println("Erro ao ler!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm, rs);
        }
        
        return P;
        
    }
    
    public void Delete(int chave){
        
        String sql = "DELETE FROM produto where codigoDeBarra = ?";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        
        try {
            
            stm = con.prepareStatement(sql);
            stm.setInt(1, chave);
            stm.execute();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm);
        }
        
    }
    
    public List <Produtos> BuscaNome(String Nome){
        
        String sql = "SELECT * FROM produto where nomePro = ?";
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        List<Produtos> produto = new ArrayList();
        
        try {
            
            stm = con.prepareStatement(sql);
            stm.setString(1, Nome);
            rs = stm.executeQuery();
            
            while(rs.next()){
                Produtos P = new Produtos();
                P.setNomeProduto(rs.getString("nomePro"));
                P.setDataValidade(rs.getString("dataValidade"));
                P.setSecao(rs.getInt("secao"));
                P.setPreco(rs.getDouble("preco"));
                
                produto.add(P);
                
            }  
            
        } catch (SQLException ex) {
            System.out.println("Erro ao ler!" + ex);
        }
        finally{
            ConnectionFactory.fechaConexao(con, stm, rs);
        }
        
        return produto;
        
    }
    
}
