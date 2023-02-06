package com.desafio.java.desafio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "TB_PESSOA")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private Integer idade;
    @ManyToOne
    @JoinColumn(name = "especie")
    private EspecieModel especieModel;

    @Column(nullable = false, length = 70)
    private String nivelPoder;

    @ManyToOne
    @JoinColumn(name = "nivel_poder")
    private NivelPoderModel nivelPoderModel;

    @ManyToOne
    @JoinColumn(name = "poder")
    private PoderModel poder;

    @Column(name = "email")
    private String email;

}
