package br.com.paulomoreno.literalura2024;

import br.com.paulomoreno.literalura2024.principal.Principal;
import br.com.paulomoreno.literalura2024.repositories.AutorRepository;
import br.com.paulomoreno.literalura2024.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Literalura2024Application implements CommandLineRunner {
	//implementação dessa interfaz pq é app de linha de comando

	public static void main(String[] args) {
		SpringApplication.run(Literalura2024Application.class, args);
	}
	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private LivroRepository livroRepository;

	@Override
	public void run(String... args) throws Exception {
		//este metodo vai ser como o meu main
		Principal principal= new Principal(livroRepository, autorRepository);
		principal.exibirMenu();

	}
}
