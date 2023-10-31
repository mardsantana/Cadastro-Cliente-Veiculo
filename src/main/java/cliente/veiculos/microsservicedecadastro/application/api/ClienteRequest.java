package cliente.veiculos.microsservicedecadastro.application.api;


import cliente.veiculos.microsservicedecadastro.application.domain.Veiculo;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

@Value
public class ClienteRequest {

    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private List<Veiculo> veiculo;

}
