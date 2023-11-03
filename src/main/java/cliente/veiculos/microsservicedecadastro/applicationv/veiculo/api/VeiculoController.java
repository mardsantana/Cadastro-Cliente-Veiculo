package cliente.veiculos.microsservicedecadastro.applicationv.veiculo.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Log4j2
@RequestMapping("/cliente/{cpf}/veiculo")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoService veiculoService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@PathVariable String cpf, @Valid @RequestBody VeiculoRequest veiculoRequest){
        log.info("[start] VeiculoController - postVeiculo");
        log.info("[cpf] {}", cpf);
        VeiculoResponse veiculo = veiculoService.criaVeiculo(cpf, veiculoRequest);
        log.info("[finish] VeiculoController - postVeiculo");
        return veiculo;
    }

}
