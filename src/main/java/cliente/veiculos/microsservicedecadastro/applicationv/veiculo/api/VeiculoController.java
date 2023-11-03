package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import cliente.veiculos.microsservicedecadastro.applicationv.veiculo.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("/cliente/veiculo")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoService veiculoService;

    @PostMapping(value = "/{cpf}")
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@PathVariable String cpf, @Valid @RequestBody VeiculoRequest veiculoRequest){
        log.info("[start] VeiculoController - postVeiculo");
        log.info("[cpf] {}", cpf);
        VeiculoResponse veiculo = veiculoService.criaVeiculo(cpf, veiculoRequest);
        log.info("[finish] VeiculoController - postVeiculo");
        return veiculo;
    }
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<VeiculoListResponse> buscaTodosVeiculos(){
        log.info("[start] VeiculoController - buscaTodosVeiculos");
        List<VeiculoListResponse> veiculoCliente = veiculoService.buscaVeiculos();
        log.info("[finish] VeiculoController - buscaTodosVeiculos");
        return veiculoCliente;
    }
}
