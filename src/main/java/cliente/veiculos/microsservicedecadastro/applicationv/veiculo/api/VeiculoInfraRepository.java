package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository{

    private final VeiculoSpringDataJPARepository veiculoSpringDataJPARepository;

    @Override
    public Veiculo save(Veiculo veiculo) {
        log.info("[start] VeiculoInfraRepository - save");
        veiculoSpringDataJPARepository.save(veiculo);
        log.info("[finish] VeiculoInfraRepository - save");
        return veiculo;
    }
}
