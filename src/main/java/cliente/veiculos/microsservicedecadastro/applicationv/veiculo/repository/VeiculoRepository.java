package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.repository;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoListResponse;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;

import java.util.List;

public interface VeiculoRepository {
    Veiculo save(Veiculo veiculo);
    List<Veiculo> buscaTodosVeiculos();
    Veiculo BuscaPorPlaca(String placa);
    void deleteVeiculo(Veiculo veiculo);
}
