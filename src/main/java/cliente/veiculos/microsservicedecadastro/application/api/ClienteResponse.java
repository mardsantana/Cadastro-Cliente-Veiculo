package cliente.veiculos.microsservicedecadastro.application.api;

import cliente.veiculos.microsservicedecadastro.application.domain.Cliente;
import lombok.Data;
import lombok.Value;

@Data
@Value
public class ClienteResponse {

    private Long idCliente;

    public ClienteResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
    }
}
