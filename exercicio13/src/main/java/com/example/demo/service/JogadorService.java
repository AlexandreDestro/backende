package com.example.demo.service;

import com.example.demo.dto.JogadorDTO;
import com.example.demo.mapper.JogadorMapper;
import com.example.demo.model.Jogador;
import com.example.demo.repository.JogadorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JogadorService {
    private final JogadorRepository jogadorRepository;
    private final JogadorMapper jogadorMapper = JogadorMapper.INSTANCE;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toModel(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return jogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(jogadorMapper::toDTO)
                .toList();
    }
}
