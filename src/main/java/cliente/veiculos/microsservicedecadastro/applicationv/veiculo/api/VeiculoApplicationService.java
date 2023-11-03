package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class VeiculoApplicationService implements VeiculoService{

    private final VeiculoRepository veiculoRepository;

    @Override
    public VeiculoResponse criaVeiculo(String cpf, VeiculoRequest veiculoRequest) {
        log.info("[start] VeiculoApplicationService - criaVeiculo");
        Veiculo veiculo = veiculoRepository.save(new Veiculo(veiculoRequest));
        log.info("[start] VeiculoApplicationService - criaVeiculo");
        return new VeiculoResponse(veiculo);
    }
}
