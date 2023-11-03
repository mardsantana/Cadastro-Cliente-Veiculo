package cliente.veiculos.microsservicedecadastro.application.infra;


import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import cliente.veiculos.microsservicedecadastro.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

    @Override
    public Cliente save(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - save");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - save");
        return cliente;
    }
    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[start] ClienteInfraRepository - buscaTodosClientes");
        List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[finish] ClienteInfraRepository - buscaTodosClientes");
        return todosClientes;
    }
    @Override
    public Cliente buscaClientePorCPF(String cpf) {
        log.info("[start] ClienteInfraRepository - buscaClientePorCPF");
        Cliente cliente = clienteSpringDataJPARepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Cliente não Econtrado!!"));
        log.info("[finish] ClienteInfraRepository - buscaClientePorCPF");
        return cliente;
    }
    @Override
    public void deleteCliente(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - deleteCliente");
        clienteSpringDataJPARepository.delete(cliente);
        log.info("[finish] ClienteInfraRepository - deleteCliente");
    }
}
