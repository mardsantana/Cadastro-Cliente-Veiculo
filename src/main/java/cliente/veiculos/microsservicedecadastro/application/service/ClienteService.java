package cliente.veiculos.microsservicedecadastro.application.service;

import cliente.veiculos.microsservicedecadastro.application.api.*;

import java.util.List;

public interface ClienteService {
    ClienteResponse clienteCriado(ClienteRequest clienteResquest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClientePorCPF(String cpf);
    void atualizaInformacoes(String cpf, ClienteAtualizaRequest clienteAtualizaRequest);
    void deleteCliente(String cpf);
}
