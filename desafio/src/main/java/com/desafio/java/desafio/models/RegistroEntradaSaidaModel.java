package com.desafio.java.desafio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "TB_REG_ENTRADA_SAIDA")
public class RegistroEntradaSaidaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "data")
    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "pessoa")
    private PessoaModel pessoa;

    @ManyToOne
    @JoinColumn(name = "tipo_movimento")
    private MovimentoModel tipoMovimento;

}
