package cliente.veiculos.microsservicedecadastro.application.repository;

import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    List<Cliente> buscaTodosClientes();
    Cliente buscaClientePorCPF(String cpf);
}
