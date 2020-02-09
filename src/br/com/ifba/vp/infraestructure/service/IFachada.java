package br.com.ifba.vp.infraestructure.service;

import br.com.ifba.vp.caixa.model.Caixa;
import br.com.ifba.vp.cliente.model.Cliente;
import br.com.ifba.vp.fornecedor.model.Fornecedor;
import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import br.com.ifba.vp.gerente.model.Gerente;
import br.com.ifba.vp.produto.model.Produto;

import java.util.List;

public interface IFachada {
    
    //---------------- Caixa -----------------------
    // Método que salva um Caixa na base de dados
    public abstract Caixa saveCaixa(Caixa caixa);
    // Método que salva um Caixa na base de dados
    public abstract Caixa updateCaixa(Caixa caixa);
    // Método que deleta um Caixa da base de dados
    public abstract void deleteCaixa(Caixa caixa);
    // Método que retorna todos Caixas da base de dados
    public abstract List<Caixa> getAllCaixa();
    
    //---------------- Cliente ---------------------
    // Método que salva um Cliente na base de dados
    public abstract Cliente saveCliente(Cliente cliente);
    // Método que salva um Cliente na base de dados
    public abstract Cliente updateCliente(Cliente cliente);
    // Método que deleta um Cliente da base de dados
    public abstract void deleteCliente(Cliente cliente);
    // Método que retorna todos Clientes da base de dados
    public abstract List<Cliente> getAllCliente();
    
    //---------------- Fornecedor ------------------
    // Método que salva um Fornecedor na base de dados
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    // Método que salva um Fornecedor na base de dados
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    // Método que deleta um Fornecedor da base de dados
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    // Método que retorna todos Fornecedor da base de dados
    public abstract List<Fornecedor> getAllFornecedor();
    
    //---------------- Funcionario Caixa -----------
    // Método que salva um FuncionarioCaixa na base de dados
    public abstract FuncionarioCaixa saveFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa);
    // Método que salva um FuncionarioCaixa na base de dados
    public abstract FuncionarioCaixa updateFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa);
    // Método que deleta um FuncionarioCaixa da base de dados
    public abstract void deleteFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa);
    // Método que retorna todos FuncionarioCaixas da base de dados
    public abstract List<FuncionarioCaixa> getAllFuncionarioCaixa();
    // Método que retorna funcionários por cpf
    public abstract List<FuncionarioCaixa> findByCpfFuncionario(String cpf);
    
    // --------------- Gerente ---------------------
    // Método que salva um Gerente na base de dados
    public abstract Gerente saveGerente(Gerente gerente);
    // Método que salva um Gerente na base de dados
    public abstract Gerente updateGerente(Gerente gerente);
    // Método que deleta um Gerente da base de dados
    public abstract void deleteGerente(Gerente gerente);
    // Método que retorna todos Gerentes da base de dados
    public abstract List<Gerente> getAllGerente();
    
    //---------------- Produto ---------------------
    // Método que salva um Produto na base de dados
    public abstract Produto saveProduto(Produto produto);
    // Método que salva um Produto na base de dados
    public abstract Produto updateProduto(Produto produto);
    // Método que deleta um Produto da base de dados
    public abstract void deleteProduto(Produto produto);
    // Método que retorna todos Produtos da base de dados
    public abstract List<Produto> getAllProduto();
    // Método que retorna produtos por nome
    public abstract List<Produto> findByNomeProduto(String produto);
    // Método que retorna produtos por código de barras
    public abstract List<Produto> findByCodigoBarras(int codigoBarras);
   
}