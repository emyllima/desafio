package com.desafio.java.desafio.dtos;

import com.desafio.java.desafio.models.NivelPoderModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PoderDto {

    @NotBlank
    private String descricaoPoder;
    @NotBlank
    private NivelPoderModel nivelPoder;

}
