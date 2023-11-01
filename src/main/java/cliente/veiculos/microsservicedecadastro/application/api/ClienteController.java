package cliente.veiculos.microsservicedecadastro.application.api;


import cliente.veiculos.microsservicedecadastro.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteResquest){
        log.info("[start] ClienteController - postCliente");
        ClienteResponse criaCliente = clienteService.clienteCriado(clienteResquest);
        log.info("[finish] ClienteController - postCliente");
        return criaCliente;
    }
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> buscaTodosClientes(){
        log.info("[start] ClienteController - buscaTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finish] ClienteController - buscaTodosClientes");
		return clientes;
    }
    @GetMapping(value = "/{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse buscaPorCPF(@PathVariable String cpf){
        log.info("[start] ClienteController - buscaPorCPF");
        log.info("[cpf] {}", cpf);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClientePorCPF(cpf);
        log.info("[finish] ClienteController - buscaPorCPF");
        return clienteDetalhado;
    }
    @PutMapping(value = "/{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    void atualizaInformacoes(@PathVariable String cpf, @Valid @RequestBody ClienteAtualizaRequest clienteAtualizaRequest){
        log.info("[start] ClienteController - atualizaInformacoes");
        log.info("[cpf] {}", cpf);
        clienteService.atualizaInformacoes(cpf, clienteAtualizaRequest);
        log.info("[finish] ClienteController - atualizaInformacoes");
    }
    @DeleteMapping(value = "/{cpf}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaClientePorCPF(@PathVariable String cpf){
        log.info("[start] ClienteContoller - deletaClientePorCPF");
        log.info("[cpf] {}", cpf);
        clienteService.deleteCliente(cpf);
        log.info("[finish] ClienteContoller - deletaClientePorCPF");
    }
}
