package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class JogadorDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Apelido é obrigatório")
    private String apelido;

    // getters e setters
}
