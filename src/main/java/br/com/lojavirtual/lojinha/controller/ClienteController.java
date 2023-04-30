package br.com.lojavirtual.lojinha.controller;

import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{identificador}")
    public Cliente obterCliente(@PathVariable("identificador") Long id) {  // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        return clienteService.obterCliente(id);
    }

    // Criar um endpoint para inserir um novo cliente (Post)
    // Criar um endpoint para editar um novo cliente (Put)
    // Criar um endpoint para deletar um novo cliente (Delete)
}