package com.example.demo.controller;


import com.example.demo.dto.TransacaoRequestDto;
import com.example.demo.dto.TransacaoResponseDto;
import com.example.demo.model.Transacao;
import com.example.demo.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pix")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public TransacaoResponseDto gerarTransacao(@RequestBody Transacao request) {
        return transacaoService.realizarTransacao(request);
    }
}