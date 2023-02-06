package com.desafio.java.desafio.dtos;

import com.desafio.java.desafio.models.NivelPoderModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NivelPoderDto {

    @NotBlank
    private String descricaoNivelPoder;
    @NotBlank
    private NivelPoderModel nivelPoderModel;

}
