package com.desafio.java.desafio.dtos;

import com.desafio.java.desafio.models.MovimentoModel;
import com.desafio.java.desafio.models.PessoaModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegistroEntradaSaidaDto {

    @NotBlank
    private LocalDateTime data;
    @NotBlank
    private PessoaModel pessoa;
    @NotBlank
    private MovimentoModel tipoMovimento;

}
