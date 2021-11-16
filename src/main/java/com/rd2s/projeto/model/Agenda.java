package com.rd2s.projeto.model;


import com.rd2s.projeto.enterprise.AbstractRegion;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Agenda extends AbstractRegion {
    @ManyToOne
    @JoinColumn(name = "I_CLIENTE", referencedColumnName = "ID")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "I_QUADRA", referencedColumnName = "ID")
    private Quadras quadra;

    @ManyToOne
    @JoinColumn(name = "I_HORARIO", referencedColumnName = "ID")
    private Horarios horario;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Quadras getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadras quadra) {
        this.quadra = quadra;
    }

    public Horarios getHorario() {
        return horario;
    }

    public void setHorario(Horarios horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Quadras{" +
                "cliente=" + cliente +
                ", quadra=" + quadra +
                ", horario=" + horario +
                '}';
    }
}