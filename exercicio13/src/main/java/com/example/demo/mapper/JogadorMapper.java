package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JogadorMapper {
    JogadorMapper INSTANCE = Mappers.getMapper(JogadorMapper.class);

    @Mapping(target = "habilidade", constant = "100")
    Jogador toModel(JogadorDTO dto);

    JogadorDTO toDTO(Jogador jogador);
}
