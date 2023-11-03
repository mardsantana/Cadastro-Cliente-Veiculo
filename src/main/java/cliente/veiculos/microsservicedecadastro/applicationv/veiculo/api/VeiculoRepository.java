package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;

public interface VeiculoRepository {
    Veiculo save(Veiculo veiculo);
}
