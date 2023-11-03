package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.service;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api.*;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.repository.VeiculoRepository;
import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Override
    public List<VeiculoListResponse> buscaVeiculos() {
        log.info("[start] VeiculoApplicationService - buscaVeiculos");
        List<Veiculo> veiculos = veiculoRepository.buscaTodosVeiculos();
        log.info("[finish] VeiculoApplicationService - buscaVeiculos");
        return VeiculoListResponse.converte(veiculos);
    }
    @Override
    public VeiculoDetalhadoResponse buscaVeiculosPorPlaca(String placa) {
        log.info("[start] VeiculoApplicationService - buscaVeiculosPorPlaca");
        Veiculo veiculo = veiculoRepository.BuscaPorPlaca(placa);
        log.info("[finish] VeiculoApplicationService - buscaVeiculosPorPlaca");
        return new VeiculoDetalhadoResponse(veiculo);
    }
    @Override
    public void atualizaInformacoesVeiculo(String placa, VeiculoAtualizaResponse veiculoAtualizaResponse) {
        log.info("[start] VeiculoApplicationService - atualizaInformacoesVeiculo");
        Veiculo veiculo = veiculoRepository.BuscaPorPlaca(placa);
        veiculo.atualiza(veiculoAtualizaResponse);
        veiculoRepository.save(veiculo);
        log.info("[finish] VeiculoApplicationService - atualizaInformacoesVeiculo");
    }
}
