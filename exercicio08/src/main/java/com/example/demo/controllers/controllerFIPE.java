package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;

@RestController
@RequestMapping("/fipe")
public class controllerFIPE {
    RestClient cliente = RestClient.create("https://parallelum.com.br");

    @GetMapping("/valor")
    @ResponseBody
    public HashMap<String, String> valor(
            @RequestParam String marca,
            @RequestParam String modelo,
            @RequestParam String ano) {
        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/"+ marca +"/modelos/"+ modelo+ "/anos/" + ano)
                .retrieve()
                .body(HashMap.class);
        respostaPersonalizada.put("valor", resposta.get("Valor"));
        respostaPersonalizada.put("mes", resposta.get("MesReferencia"));
        return respostaPersonalizada;
    }
}
