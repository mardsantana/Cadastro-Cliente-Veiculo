package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import lombok.Data;

@Data
public class VeiculoAtualizaResponse {
    private String modelo;
    private String placa;
    private String ano;
    private String fabricante;
}
