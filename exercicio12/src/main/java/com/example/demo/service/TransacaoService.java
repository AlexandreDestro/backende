package com.example.demo.service;


import com.example.demo.dto.ContaDto;
import com.example.demo.dto.TransacaoResponseDto;
import com.example.demo.mapper.ContaMapper;
import com.example.demo.model.Conta;

import com.example.demo.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {
    private List<Conta> contas;
    private ContaMapper contaMapper = new ContaMapper();

    public TransacaoService() {
        contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Fulano"));
        contas.add(new Conta("320-2", "Ciclano"));
    }

    public TransacaoResponseDto realizarTransacao(Transacao transacao) {
        String origem = String.valueOf(transacao.getOrigem());
        String destino = String.valueOf(transacao.getDestino());
        double valor = transacao.getValor();

        Conta contaOrigem = null;
        Conta contaDestino = null;

        for (Conta conta : contas) {
            if (conta.getCodigo().equals(origem)) {
                contaOrigem = conta;
            }
            if (conta.getCodigo().equals(destino)) {
                contaDestino = conta;
            }
        }

        if (contaOrigem != null && contaDestino != null) {
            ContaDto origemDto = contaMapper.toDTO(contaOrigem);
            ContaDto destinoDto = contaMapper.toDTO(contaDestino);

            return new TransacaoResponseDto(origemDto, destinoDto, valor);
        }
        return null;
    }
}