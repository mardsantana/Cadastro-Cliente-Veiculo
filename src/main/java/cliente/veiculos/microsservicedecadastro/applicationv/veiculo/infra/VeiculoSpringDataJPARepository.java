package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.infra;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoSpringDataJPARepository extends JpaRepository<Veiculo, Long> {
}
