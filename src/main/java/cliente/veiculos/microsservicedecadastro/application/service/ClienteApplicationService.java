package cliente.veiculos.microsservicedecadastro.application.service;


import cliente.veiculos.microsservicedecadastro.application.api.ClienteDetalhadoResponse;
import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteListResponse;
import cliente.veiculos.microsservicedecadastro.application.repository.ClienteRepository;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteRequest;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse clienteCriado(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - clienteCriado");
        Cliente cliente = clienteRepository.save(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - clienteCriado");
        return new ClienteResponse(cliente);
    }
    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[start] ClienteApplicationService - buscaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finish] ClienteApplicationService - buscaTodosClientes");
        return ClienteListResponse.converte(clientes);
    }
    @Override
    public ClienteDetalhadoResponse buscaClientePorCPF(String cpf) {
        log.info("[start] ClienteApplicationService - buscaClientePorCPF");
        Cliente cliente = clienteRepository.buscaClientePorCPF(cpf);
        log.info("[finish] ClienteApplicationService - buscaClientePorCPF");
        return new ClienteDetalhadoResponse(cliente);
    }
}
