package com.desafio.java.desafio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "TB_PODER")
public class PoderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "descricao_poder")
    private String descricaoPoder;

    @ManyToOne
    @JoinColumn(name = "nivel_poder")
    private NivelPoderModel nivelPoder;

}
