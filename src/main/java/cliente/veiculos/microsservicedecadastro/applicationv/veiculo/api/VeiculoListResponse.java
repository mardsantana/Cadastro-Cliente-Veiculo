package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class VeiculoListResponse {

    private Long idVeiculo;
    private String modelo;
    private String placa;
    private String ano;
    private String fabricante;

    public VeiculoListResponse(Veiculo veiculo) {
        this.idVeiculo = veiculo.getIdVeiculo();
        this.modelo = veiculo.getModelo();
        this.placa = veiculo.getPlaca();
        this.ano = veiculo.getAno();
        this.fabricante = veiculo.getFabricante();
    }

    public static List<VeiculoListResponse> converte(List<Veiculo> veiculos) {
        return veiculos.stream()
                .map(VeiculoListResponse::new)
                .collect(Collectors.toList());
    }

}
