package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
public class VeiculoRequest {

    @NotNull
    private String modelo;
    @NotNull
    @Column(unique = true)
    private String placa;
    @NotNull
    private String ano;
    @NotNull
    private String fabricante;
}
