package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Estado;
import com.rd2s.projeto.model.Pais;

public class EstadoDTO {
    private String id;
    private String nome;
    private String populacao;
    private PaisDTO pais;

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

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public static EstadoDTO toDTO(Estado estado){
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId().toString());
        dto.setNome(estado.getNome());
        dto.setPopulacao(estado.getPopulacao());
        dto.setPais(estado.getPais() != null ? PaisDTO.toDTO(estado.getPais()) : null);
        return dto;
    }

    public static Estado fromDTO(EstadoDTO dto){
        Estado entity = new Estado();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        //entity.setPais(dto.getPais());
        return entity;
    }
}

