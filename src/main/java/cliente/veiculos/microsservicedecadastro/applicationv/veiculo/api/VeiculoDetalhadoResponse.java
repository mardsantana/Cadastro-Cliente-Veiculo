package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.Data;

@Data
public class VeiculoDetalhadoResponse {
    private String modelo;
    private String placa;
    private String ano;
    private String fabricante;

    public VeiculoDetalhadoResponse(Veiculo veiculo) {
        this.modelo = veiculo.getModelo();
        this.placa = veiculo.getPlaca();
        this.ano = veiculo.getAno();
        this.fabricante = veiculo.getFabricante();
    }
}
