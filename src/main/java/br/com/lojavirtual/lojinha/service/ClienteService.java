package br.com.lojavirtual.lojinha.service;

import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obterListaClientes() { // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        return clienteRepository.findAll();
    }

    public Cliente obterCliente(Long id) { // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente registrarCliente(@RequestBody Cliente cliente){
       return clienteRepository.save(cliente);
    }

    public Cliente editarCliente(Long id, @RequestBody Cliente cliente){
        Cliente clienteAtual = clienteRepository.findById(id).get();
        BeanUtils.copyProperties(cliente, clienteAtual, "id");
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(@PathVariable Long id){
       clienteRepository.deleteById(id);
    }

}