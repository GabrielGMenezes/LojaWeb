package br.com.lojavirtual.lojinha.service;

import br.com.lojavirtual.lojinha.controller.ClienteDTO;
import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obterListaClientes() { // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        return clienteRepository.findAll();
    }
}
