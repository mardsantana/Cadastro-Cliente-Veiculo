package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.infra;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.VeiculoListResponse;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.repository.VeiculoRepository;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {

    private final VeiculoSpringDataJPARepository veiculoSpringDataJPARepository;

    @Override
    public Veiculo save(Veiculo veiculo) {
        log.info("[start] VeiculoInfraRepository - save");
        veiculoSpringDataJPARepository.save(veiculo);
        log.info("[finish] VeiculoInfraRepository - save");
        return veiculo;
    }
    @Override
    public List<Veiculo> buscaTodosVeiculos() {
        log.info("[start] VeiculoInfraRepository - buscaTodosVeiculos");
        List<Veiculo> todosVeiculos = veiculoSpringDataJPARepository.findAll();
        log.info("[finish] VeiculoInfraRepository - buscaTodosVeiculos");
        return todosVeiculos;
    }
    @Override
    public Veiculo BuscaPorPlaca(String placa) {
        log.info("[start] VeiculoInfraRepository - buscaPorPlaca");
        Veiculo veiculo = veiculoSpringDataJPARepository.findByPlaca(placa)
                        .orElseThrow(() -> new RuntimeException("Veículo não Encotrado, Chefia!"));
        log.info("[finish] VeiculoInfraRepository - buscaPorPlaca");
        return veiculo;
    }
    @Override
    public void deleteVeiculo(Veiculo veiculo) {
        log.info("[start] VeiculoInfraRepository - deleteVeiculo");
        veiculoSpringDataJPARepository.delete(veiculo);
        log.info("[finish] VeiculoInfraRepository - deleteVeiculo");
    }
}
