package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.infra;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VeiculoSpringDataJPARepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByPlaca(String placa);
}
