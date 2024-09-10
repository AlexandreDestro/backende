
//Exercício 07: Controladores Web
//ex: http://localhost:8080/nome?primeiroNome=Isis&segundoNome=Costa

package org.exercicio07.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}