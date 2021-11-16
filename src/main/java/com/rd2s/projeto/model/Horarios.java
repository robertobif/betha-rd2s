package com.rd2s.projeto.model;

import com.rd2s.projeto.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "HORARIOS")
public class Horarios extends AbstractEntity {

    @Column(name = "HORA_INI")
    @NotNull
    private String Hora_Ini;

    @Column(name = "HORA_FIN")
    @NotNull
    private String Hora_Fin;

    public String getHora_Ini() {
        return Hora_Ini;
    }

    public void setHora_Ini(String hora_Ini) {
        Hora_Ini = hora_Ini;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String hora_Fin) {
        Hora_Fin = hora_Fin;
    }

    @Override
    public String toString() {
        return "Horarios{" +
                "Hora_Ini='" + Hora_Ini + '\'' +
                ", Hora_Fin='" + Hora_Fin + '\'' +
                '}';
    }
}