package cliente.veiculos.microsservicedecadastro.application.domain;


import cliente.veiculos.microsservicedecadastro.application.api.ClienteAtualizaRequest;
import cliente.veiculos.microsservicedecadastro.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    @NotBlank
    private String nome;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotBlank
    private String telefone;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veiculo> veiculo;

    public Cliente(ClienteRequest clienteRequest) {
        this.nome = clienteRequest.getNome();
        this.cpf = clienteRequest.getCpf();
        this.telefone = clienteRequest.getTelefone();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.veiculo = clienteRequest.getVeiculo();
    }
    public void atualiza(ClienteAtualizaRequest clienteAtualizaRequest) {
        this.nome = clienteAtualizaRequest.getNome();
        this.telefone = clienteAtualizaRequest.getTelefone();
        this.dataNascimento = clienteAtualizaRequest.getDataNascimento();
    }
}
