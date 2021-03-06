package com.rd2s.projeto.repository;

import com.rd2s.projeto.model.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorariosRepository extends JpaRepository<Horarios, Long> {
}
