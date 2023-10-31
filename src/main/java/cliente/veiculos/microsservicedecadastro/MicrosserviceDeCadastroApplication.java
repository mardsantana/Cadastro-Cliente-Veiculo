package cliente.veiculos.microsservicedecadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class MicrosserviceDeCadastroApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Cliente - API Home";

	}

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceDeCadastroApplication.class, args);
	}

}
