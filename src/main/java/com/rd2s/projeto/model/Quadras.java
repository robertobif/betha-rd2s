package com.rd2s.projeto.model;

import com.rd2s.projeto.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name = "QUADRAS")
public class Quadras extends AbstractEntity {

    @Column(name = "NOME")
    @NotNull
    @Size(max = 50, message = "Nome da quadra não pode ter mais que 50 caracteres.")
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Quadras{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}

