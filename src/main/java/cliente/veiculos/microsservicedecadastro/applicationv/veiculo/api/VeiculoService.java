package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

public interface VeiculoService {
    VeiculoResponse criaVeiculo(String cpf, VeiculoRequest veiculoRequest);
}
