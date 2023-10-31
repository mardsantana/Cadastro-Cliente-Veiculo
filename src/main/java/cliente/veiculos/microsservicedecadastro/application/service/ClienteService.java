package cliente.veiculos.microsservicedecadastro.application.service;

import cliente.veiculos.microsservicedecadastro.application.api.ClienteDetalhadoResponse;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteListResponse;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteRequest;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse clienteCriado(ClienteRequest clienteResquest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClientePorCPF(String cpf);
}
