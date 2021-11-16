package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Equipes;
import com.rd2s.projeto.model.Pais;

public class EquipesDTO {
    private String id;
    private String nome;
    private ClientesDTO responsavel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClientesDTO getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ClientesDTO responsavel) {
        this.responsavel = responsavel;
    }

    public static EquipesDTO toDTO(Equipes equipe){
        EquipesDTO dto = new EquipesDTO();
        dto.setId(equipe.getId().toString());
        dto.setNome(equipe.getNome());
        dto.setResponsavel(equipe.getCliente() != null ? ClientesDTO.toDTO(equipe.getCliente()) : null);
        return dto;
    }

    public static Equipes fromDTO(EquipesDTO dto){
        Equipes entity = new Equipes();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome((dto.getNome()));
        //entity.setResponsavel(dto.getCliente());
        //entity.setPais(dto.getPais());
        return entity;
    }
}


