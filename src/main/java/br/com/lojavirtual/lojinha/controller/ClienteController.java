package br.com.lojavirtual.lojinha.controller;

import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente registrarCliente(@RequestBody Cliente registrarCliente){
      return  clienteService.registrarCliente(registrarCliente);
    }

    // Criar um endpoint para editar um novo cliente (Put)
    @PutMapping("/{id}")
    public Cliente editarCliente (@PathVariable Long id, @RequestBody Cliente cliente) throws Exception {
        return clienteService.editarCliente(id, cliente);
    }

    // Criar um endpoint para deletar um novo cliente (Delete)
    @DeleteMapping("/{id}")
    public void deletarCliente (@PathVariable Long id) throws Exception {
        clienteService.deletarCliente(id);
    }

}