package cliente.veiculos.microsservicedecadastro.application.service;


import cliente.veiculos.microsservicedecadastro.application.api.*;
import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import cliente.veiculos.microsservicedecadastro.application.repository.ClienteRepository;
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
    @Override
    public void atualizaInformacoes(String cpf, ClienteAtualizaRequest clienteAtualizaRequest) {
        log.info("[start] ClienteApplicationService - atualizaInformacoes");
        Cliente cliente = clienteRepository.buscaClientePorCPF(cpf);
        cliente.atualiza(clienteAtualizaRequest);
        clienteRepository.save(cliente);
        log.info("[finish] ClienteApplicationService - atualizaInformacoes");
    }
    @Override
    public void deleteCliente(String cpf) {
        log.info("[start] ClienteApplicationService - deleteCliente");
        Cliente cliente = clienteRepository.buscaClientePorCPF(cpf);
        clienteRepository.deleteCliente(cliente);
        log.info("[finish] ClienteApplicationService - deleteCliente");

    }
}
