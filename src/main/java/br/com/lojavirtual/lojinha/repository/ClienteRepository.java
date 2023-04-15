package br.com.lojavirtual.lojinha.repository;

import br.com.lojavirtual.lojinha.model.Cliente;

import java.math.BigDecimal;
import java.util.List;

public class ClienteRepository {
    public List<Cliente> obterListaClientes() {
        Cliente cliente = new Cliente("nomeCliente", "endereço", "email", "credit", "frete", BigDecimal.valueOf(100), null);

        return List.of(cliente);
    }
}
