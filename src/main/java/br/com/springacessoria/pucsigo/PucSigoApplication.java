package br.com.springacessoria.pucsigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.springacessoria.pucsigo")
@EntityScan(basePackages = "br.com.springacessoria.pucsigo.model")
public class PucSigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PucSigoApplication.class, args);
	}

}
