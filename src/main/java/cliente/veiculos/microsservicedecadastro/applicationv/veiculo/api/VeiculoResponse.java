package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.Data;

@Data
public class VeiculoResponse {
    private Long idVeiculo;

    public VeiculoResponse(Veiculo veiculo) {
        this.idVeiculo = veiculo.getIdVeiculo();
    }
}
