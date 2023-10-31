package cliente.veiculos.microsservicedecadastro.application.api;


import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import cliente.veiculos.microsservicedecadastro.application.domain.Veiculo;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

@Value
public class ClienteDetalhadoResponse {
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private List<Veiculo> veiculo;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.telefone = cliente.getTelefone();
        this.dataNascimento = cliente.getDataNascimento();
        this.veiculo = cliente.getVeiculo();
    }
}
