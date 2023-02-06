package com.desafio.java.desafio.dtos;

import com.desafio.java.desafio.models.EspecieModel;
import com.desafio.java.desafio.models.NivelPoderModel;
import com.desafio.java.desafio.models.PoderModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PessoaDto {

    @NotBlank
    private Integer idade;
    @NotBlank
    private String nome;
    @NotBlank
    private EspecieModel especieModel;
    @NotBlank
    private String nivelPoder;
    @NotBlank
    private NivelPoderModel nivelPoderModel;
    @NotBlank
    private PoderModel poder;
    @NotBlank
    private String email;

}
