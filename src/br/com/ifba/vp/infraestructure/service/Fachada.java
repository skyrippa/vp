package br.com.ifba.vp.infraestructure.service;

// classes Caixa
import br.com.ifba.vp.caixa.model.Caixa;
import br.com.ifba.vp.caixa.service.IServiceCaixa;
import br.com.ifba.vp.caixa.service.ServiceCaixa;
// classes Cliente
import br.com.ifba.vp.cliente.model.Cliente;
import br.com.ifba.vp.cliente.service.IServiceCliente;
import br.com.ifba.vp.cliente.service.ServiceCliente;
// classes Fornecedor
import br.com.ifba.vp.fornecedor.model.Fornecedor;
import br.com.ifba.vp.fornecedor.service.IServiceFornecedor;
import br.com.ifba.vp.fornecedor.service.ServiceFornecedor;
// classes FuncionarioCaixa
import br.com.ifba.vp.funcionarioCaixa.model.FuncionarioCaixa;
import br.com.ifba.vp.funcionarioCaixa.service.IServiceFuncionarioCaixa;
import br.com.ifba.vp.funcionarioCaixa.service.ServiceFuncionarioCaixa;
// classes Gerente
import br.com.ifba.vp.gerente.model.Gerente;
import br.com.ifba.vp.gerente.service.IServiceGerente;
import br.com.ifba.vp.gerente.service.ServiceGerente;
// classes Endereco
import br.com.ifba.vp.infraestructure.endereco.model.Endereco;
import br.com.ifba.vp.infraestructure.endereco.service.IServiceEndereco;
import br.com.ifba.vp.infraestructure.endereco.service.ServiceEndereco;
// classes Telefone
import br.com.ifba.vp.infraestructure.telefone.model.Telefone;
import br.com.ifba.vp.infraestructure.telefone.service.IServiceTelefone;
import br.com.ifba.vp.infraestructure.telefone.service.ServiceTelefone;
// classes Produto
import br.com.ifba.vp.produto.model.Produto;
import br.com.ifba.vp.produto.service.IServiceProduto;
import br.com.ifba.vp.produto.service.ServiceProduto;

import java.util.List;

public class Fachada implements IFachada {
    
    //------------------- ENDEREÇO ----------------------------//
    private final IServiceEndereco serviceEndereco = new ServiceEndereco();
    
    @Override
    public Endereco saveEndereco(Endereco endereco) {
        return this.serviceEndereco.saveEndereco(endereco);
    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {
        return this.serviceEndereco.updateEndereco(endereco);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        this.serviceEndereco.deleteEndereco(endereco);
    }

    @Override
    public List<Endereco> getAllEndereco() {
        return this.serviceEndereco.getAllEndereco();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- TELEFONE -------------------------//
    private final IServiceTelefone serviceTelefone = new ServiceTelefone();
    
    @Override
    public Telefone saveTelefone(Telefone telefone) {
        return this.serviceTelefone.saveTelefone(telefone);
    }
    
    @Override
    public Telefone updateTelefone(Telefone telefone) {
        return this.serviceTelefone.updateTelefone(telefone);
    }
    
    @Override
    public void deleteTelefone(Telefone telefone) {
        this.serviceTelefone.deleteTelefone(telefone);
    }
    
    @Override
    public List<Telefone> getAllTelefone() {
        return this.serviceTelefone.getAllTelefone();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- CAIXA -------------------------//
    private final IServiceCaixa serviceCaixa = new ServiceCaixa();
    
    @Override
    public Caixa saveCaixa(Caixa caixa) {
        return this.serviceCaixa.saveCaixa(caixa);
    }
    
    @Override
    public Caixa updateCaixa(Caixa caixa) {
        return this.serviceCaixa.updateCaixa(caixa);
    }
    
    @Override
    public void deleteCaixa(Caixa caixa) {
        this.serviceCaixa.deleteCaixa(caixa);
    }
    
    @Override
    public List<Caixa> getAllCaixa() {
        return this.serviceCaixa.getAllCaixa();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- CLIENTE -------------------------//
    private final IServiceCliente serviceCliente = new ServiceCliente();
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        return this.serviceCliente.saveCliente(cliente);
    }
    
    @Override
    public Cliente updateCliente(Cliente cliente) {
        return this.serviceCliente.updateCliente(cliente);
    }
    
    @Override
    public void deleteCliente(Cliente cliente) {
        this.serviceCliente.deleteCliente(cliente);
    }
    
    @Override
    public List<Cliente> getAllCliente() {
        return this.serviceCliente.getAllCliente();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- FORNECEDOR -------------------------//
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }
    
    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return this.serviceFornecedor.updateFornecedor(fornecedor);
    }
    
    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        this.serviceFornecedor.deleteFornecedor(fornecedor);
    }
    
    @Override
    public List<Fornecedor> getAllFornecedor() {
        return this.serviceFornecedor.getAllFornecedor();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- FUNCIONARIOCAIXA -------------------------//
    private final IServiceFuncionarioCaixa serviceFuncionarioCaixa = new ServiceFuncionarioCaixa();
    
    @Override
    public FuncionarioCaixa saveFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        return this.serviceFuncionarioCaixa.saveFuncionarioCaixa(funcionarioCaixa);
    }
    
    @Override
    public FuncionarioCaixa updateFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        return this.serviceFuncionarioCaixa.updateFuncionarioCaixa(funcionarioCaixa);
    }
    
    @Override
    public void deleteFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        this.serviceFuncionarioCaixa.deleteFuncionarioCaixa(funcionarioCaixa);
    }
    
    @Override
    public List<FuncionarioCaixa> getAllFuncionarioCaixa() {
        return this.serviceFuncionarioCaixa.getAllFuncionarioCaixa();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- GERENTE -------------------------//
    private final IServiceGerente serviceGerente = new ServiceGerente();
    
    @Override
    public Gerente saveGerente(Gerente gerente) {
        return this.serviceGerente.saveGerente(gerente);
    }
    
    @Override
    public Gerente updateGerente(Gerente gerente) {
        return this.serviceGerente.updateGerente(gerente);
    }
    
    @Override
    public void deleteGerente(Gerente gerente) {
        this.serviceGerente.deleteGerente(gerente);
    }
    
    @Override
    public List<Gerente> getAllGerente() {
        return this.serviceGerente.getAllGerente();
    }
    // ------------------- END ----------------------------//
    
    
    //-------------------- PRODUTO -------------------------//
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    @Override
    public Produto saveProduto(Produto produto) {
        return this.serviceProduto.saveProduto(produto);
    }
    
    @Override
    public Produto updateProduto(Produto produto) {
        return this.serviceProduto.updateProduto(produto);
    }
    
    @Override
    public void deleteProduto(Produto produto) {
        this.serviceProduto.deleteProduto(produto);
    }
    
    @Override
    public List<Produto> getAllProduto() {
        return this.serviceProduto.getAllProduto();
    }
    // ------------------- END ----------------------------//
}
