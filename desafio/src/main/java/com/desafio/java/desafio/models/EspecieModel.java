package com.desafio.java.desafio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "TB_ESPECIE")
public class EspecieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "descricaoEspecie")
    private String descricaoEspecie;

}
