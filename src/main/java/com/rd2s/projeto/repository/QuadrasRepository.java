package com.rd2s.projeto.repository;

import com.rd2s.projeto.model.Quadras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadrasRepository extends JpaRepository<Quadras, Long> {
}
