package br.com.lojavirtual.lojinha.controller;

import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterListaClientes() {  // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        return clienteService.obterListaClientes();
    }
}