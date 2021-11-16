package com.rd2s.projeto.model;

import com.rd2s.projeto.enterprise.AbstractRegion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Jogadores extends AbstractRegion {
    @ManyToOne
    @JoinColumn(name="I_JOGADOR",referencedColumnName = "ID")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name="I_EQUIPE",referencedColumnName = "ID")
    private Equipes equipe;

    @ManyToOne
    @JoinColumn(name="I_POSICAO",referencedColumnName = "ID")
    private Posicoes posicao;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Equipes getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipes equipe) {
        this.equipe = equipe;
    }

    public Posicoes getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicoes posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogadores{" +
                "cliente=" + cliente +
                ", equipe=" + equipe +
                ", posicao=" + posicao +
                '}';
    }
}
