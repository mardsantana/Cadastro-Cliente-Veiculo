package cliente.veiculos.microsservicedecadastro.application.infra;

import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, Long> {

    Optional<Object> findByCpf(String cpf);
}
