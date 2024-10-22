package com.example.demo.dto;

public record TransacaoResponseDto(ContaDto origem, ContaDto destino, double valor) {}
