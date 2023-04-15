package br.com.lojavirtual.lojinha.model;

import java.math.BigDecimal;

public class Cliente extends Usuario  {
    private String nomeCliente;
    private String endereco;
    private String email;
    private String infCardCredit;
    private String infFrete;
    private BigDecimal saldoConta;

    private CarrinhoCompras carrinho;

    public Cliente(String nomeCliente, String endereco, String email, String infCardCredit, String infFrete, BigDecimal saldoConta, CarrinhoCompras carrinho){
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.email = email;
        this.infCardCredit = infCardCredit;
        this.infFrete = infFrete;
        this.saldoConta = saldoConta;
        this.carrinho = carrinho;
    }

    public void registrar() {

    }

    public boolean login() {
        return false;
    }

    public void atualizarPerfil() {
    }

    @Override
    public boolean verificarLogin() {
        return false;
    }

    public String getNomeCliente() { // todo Todos esses getters são desnecessarios e irei removelos em breve
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getInfCardCredit() {
        return infCardCredit;
    }

    public String getInfFrete() {
        return infFrete;
    }

    public BigDecimal getSaldoConta() {
        return saldoConta;
    }

    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }
    
}
