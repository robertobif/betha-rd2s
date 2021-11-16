package com.rd2s.projeto.repository;

import com.rd2s.projeto.model.Jogadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {
}
