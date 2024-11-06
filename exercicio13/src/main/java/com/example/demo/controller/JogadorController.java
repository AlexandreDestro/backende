package com.example.demo.controller;

import com.example.demo.dto.JogadorDTO;
import com.example.demo.service.JogadorService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public JogadorDTO criarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        return jogadorService.criarJogador(jogadorDTO);
    }

    @GetMapping
    public List<JogadorDTO> listarJogadores() {
        return jogadorService.listarJogadores();
    }
}
