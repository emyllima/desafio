package com.desafio.java.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PoderRepository extends JpaRepository<PoderRepository, UUID> {
}
