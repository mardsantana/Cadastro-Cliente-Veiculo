package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.service;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.*;

import java.util.List;

public interface VeiculoService {
    VeiculoResponse criaVeiculo(String cpf, VeiculoRequest veiculoRequest);
    List<VeiculoListResponse> buscaVeiculos();
    VeiculoDetalhadoResponse buscaVeiculosPorPlaca(String placa);
    void atualizaInformacoesVeiculo(String placa, VeiculoAtualizaResponse veiculoAtualizaResponse);
}
