package com.rd2s.projeto.model;


import com.rd2s.projeto.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EQUIPES")
public class Equipes extends AbstractEntity {

    @Column(name = "NOME")
    @NotNull
    @Size(max = 50, message = "Nome da equipe não pode ter mais que 50 caracteres.")
    private String Nome;

    @ManyToOne
    @JoinColumn(name="I_RESPONSAVEL",referencedColumnName = "ID")
    private Clientes cliente;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Equipes{" +
                "Nome='" + Nome + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}