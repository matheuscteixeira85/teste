package com.example.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<html> \n"
				+ "    <head> \n"
				+ "        <title>Exemplo de atributo img src</title> \n"
				+ "    </head> \n"
				+ "    <body> \n"
				+ "        <section> \n"
				+ "    <p>Melhores histórias</p> \n"
				+ "    <section> \n"
				+ "        <p>News</p> \n"
				+ "        <article>História 1</article> \n"
				+ "        <article>História 2</article> \n"
				+ "        <article>História 3</article> \n"
				+ "    </section> \n"
				+ "    <section> \n"
				+ "        <p>Sport</p> \n"
				+ "        <article>História 1</article> \n"
				+ "        <article>História 2</article> \n"
				+ "        <article>História 3</article> \n"
				+ "    </section> \n"
				+ "</section>"
				+ "    </body> \n"
				+ "</html>";
	}
	
}
