package cliente.veiculos.microsservicedecadastro.application.api;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteAtualizaRequest {

    private String nome;
    private String telefone;
    private LocalDate dataNascimento;

}
