package com.desafio.java.desafio.controllers;

import com.desafio.java.desafio.models.EspecieModel;
import com.desafio.java.desafio.repositories.EspecieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/especies")
public class EspecieController {

    private EspecieRepository especieRepository;

    public EspecieController(EspecieRepository especieRepository) {
        this.especieRepository = especieRepository;
    }

    @GetMapping
    public List<EspecieModel> getAllEspecies() {
        return especieRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspecieModel> getEspecieById(@PathVariable UUID id) {
        Optional<EspecieModel> especie = especieRepository.findById(id);
        if (!especie.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(especie.get());
    }

}
