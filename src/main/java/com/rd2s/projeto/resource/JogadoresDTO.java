package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Clientes;
import com.rd2s.projeto.model.Equipes;
import com.rd2s.projeto.model.Jogadores;
import com.rd2s.projeto.model.Posicoes;

public class JogadoresDTO {
    private String id;
    private ClientesDTO jogador;
    private PosicoesDTO posicao;
    private EquipesDTO equipe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientesDTO getJogador() {
        return jogador;
    }

    public void setJogador(ClientesDTO jogador) {
        this.jogador = jogador;
    }

    public PosicoesDTO getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicoesDTO posicao) {
        this.posicao = posicao;
    }

    public EquipesDTO getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipesDTO equipe) {
        this.equipe = equipe;
    }

    public static com.rd2s.projeto.resource.JogadoresDTO toDTO(Jogadores jogador){
        com.rd2s.projeto.resource.JogadoresDTO dto = new com.rd2s.projeto.resource.JogadoresDTO();
        dto.setId(jogador.getId().toString());
        dto.setJogador(jogador.getCliente() != null ? ClientesDTO.toDTO(jogador.getCliente()) : null);
        dto.setEquipe(jogador.getEquipe() != null ? EquipesDTO.toDTO(jogador.getEquipe()): null);
        dto.setPosicao(jogador.getPosicao() != null ? PosicoesDTO.toDTO(jogador.getPosicao()): null);


        return dto;
    }

    public static Jogadores fromDTO(com.rd2s.projeto.resource.JogadoresDTO dto){
        Jogadores entity = new Jogadores();
        entity.setId(Long.getLong(dto.getId()));
        //entity.setCliente(dto.getJogador());

        //entity.setPais(dto.getPais());
        return entity;
    }
}




