package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVeiculo;
    private String modelo;
    private String placa;
    private String ano;
    private String fabricante;

    public Veiculo(VeiculoRequest veiculoRequest) {
        this.modelo = veiculoRequest.getModelo();
        this.placa = veiculoRequest.getPlaca();
        this.ano = veiculoRequest.getAno();
        this.fabricante = veiculoRequest.getFabricante();
    }

    public Veiculo(Veiculo veiculo) {
        this.modelo = veiculo.getModelo();
        this.placa = veiculo.getPlaca();
        this.ano = veiculo.getAno();
        this.fabricante = veiculo.getFabricante();
    }
}
