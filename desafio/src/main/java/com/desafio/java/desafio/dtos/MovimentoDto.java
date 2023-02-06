package com.desafio.java.desafio.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MovimentoDto {
    @NotBlank
    private String tipo;

}
