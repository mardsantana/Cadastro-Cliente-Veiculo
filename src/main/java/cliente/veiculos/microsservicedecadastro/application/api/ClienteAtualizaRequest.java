package cliente.veiculos.microsservicedecadastro.application.api;

import lombok.Value;

import java.time.LocalDate;

@Value
public class ClienteAtualizaRequest {

    private String nome;
    private String telefone;
    private LocalDate dataNascimento;

}
