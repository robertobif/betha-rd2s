package com.rd2s.projeto.repository;

import com.rd2s.projeto.model.Equipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipesRepository extends JpaRepository<Equipes, Long> {
}
