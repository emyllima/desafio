package com.desafio.java.desafio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_NIVEL_PODER")
public class NivelPoderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "descricao_nivel_poder")
    private String descricaoNivelPoder;

    @ManyToOne
    @JoinColumn(name = "nivel_poder")
    private NivelPoderModel nivelPoderModel;
}
