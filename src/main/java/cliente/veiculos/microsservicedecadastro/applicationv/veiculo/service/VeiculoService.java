package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.service;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoDetalhadoResponse;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoListResponse;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoRequest;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoResponse;

import java.util.List;

public interface VeiculoService {
    VeiculoResponse criaVeiculo(String cpf, VeiculoRequest veiculoRequest);
    List<VeiculoListResponse> buscaVeiculos();
    VeiculoDetalhadoResponse buscaVeiculosPorPlaca(String placa);
}
