
package org.exercicio07.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Gerador {

    @GetMapping("/nome")
    public String nome(@RequestParam(value = "primeiroNome", defaultValue = "") String primeiroNome,
                       @RequestParam(value = "segundoNome", defaultValue = "") String segundoNome) {

        Random geradorAleatorio = new Random();
        Integer numeroAleatorio = geradorAleatorio.nextInt(90) + 10; // Gera um número entre 10 e 99

        return "Nome gerado: " + primeiroNome + " " + segundoNome + " " + numeroAleatorio;
    }
}
