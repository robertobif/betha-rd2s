package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Horarios;

public class HorariosDTO {

    private Long id;

    private String hora_ini;

    private String hora_fin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(String hora_ini) {
        this.hora_ini = hora_ini;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public static HorariosDTO toDTO(Horarios horario) {
        HorariosDTO dto = new HorariosDTO();
        dto.setId(horario.getId());
        dto.setHora_ini(horario.getHora_Ini());
        dto.setHora_fin(horario.getHora_Fin());
        return dto;
    }

    public static Horarios fromDTO(HorariosDTO dto) {
        Horarios entity = new Horarios();
        entity.setId(dto.getId());
        return entity;
    }
}