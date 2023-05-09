package br.com.lojavirtual.lojinha.service;

import br.com.lojavirtual.lojinha.model.Cliente;
import br.com.lojavirtual.lojinha.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

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

    public Cliente registrarCliente(Cliente cliente){// todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        validarNomeCLiente(cliente.getNome());
        return clienteRepository.save(cliente);
    }

    public Cliente editarCliente(Long id, Cliente cliente) throws Exception { // todo Eu sei que não posso passar uma entidade "Cliente" , deveria ser um DTO
        validarNomeCLiente(cliente.getNome());
        Cliente clienteAtual = obterClienteOuLancarErro(id);
        BeanUtils.copyProperties(cliente, clienteAtual, "id");
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) throws Exception {
        obterClienteOuLancarErro(id);
        clienteRepository.deleteById(id);
    }

    private void validarNomeCLiente(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome é obrigatorio");
        }
    }

    private Cliente obterClienteOuLancarErro(Long id) throws Exception {
        return clienteRepository.findById(id).orElseThrow(()->new Exception("Cliente nao encontrado"));
    }

}