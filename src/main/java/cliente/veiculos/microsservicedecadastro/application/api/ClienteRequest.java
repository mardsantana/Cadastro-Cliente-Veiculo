package cliente.veiculos.microsservicedecadastro.application.api;


import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.Data;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class ClienteRequest {

    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private List<Veiculo> veiculo;

}
