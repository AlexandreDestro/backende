package com.example.demo.mapper;
import com.example.demo.model.Conta;
import com.example.demo.dto.ContaDto;



public class ContaMapper {
    public static ContaDto toDTO(Conta conta) {
        return new ContaDto(conta.getCodigo(), conta.getCliente());
    }
}
