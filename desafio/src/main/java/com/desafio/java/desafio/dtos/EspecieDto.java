package com.desafio.java.desafio.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Data
public class EspecieDto {
    @NotBlank
    private UUID id;
    @NotBlank
    private String descricaoEspecie;

}
