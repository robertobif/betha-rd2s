package com.rd2s.projeto.resource;


import com.rd2s.projeto.model.Clientes;

public class ClientesDTO {
    private String id;
    private String nome;
    private String endereco;
    private CidadeDTO cidade;
    private String bairro;
    private String telefone;
    private String celular;
    private String email;
    private String cpf;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static ClientesDTO toDTO(Clientes cliente){
        ClientesDTO dto = new ClientesDTO();
        dto.setId(cliente.getId().toString());
        dto.setEndereco(cliente.getEndereco());
        dto.setNome(cliente.getNome());
        dto.setCidade(cliente.getCidade() != null ? CidadeDTO.toDTO(cliente.getCidade()) : null);
        dto.setBairro(cliente.getBairro());
        dto.setTelefone(cliente.getTelefone());
        dto.setCelular(cliente.getCelular());
        dto.setEmail(cliente.getEmail());
        dto.setCpf(cliente.getCpf());
        return dto;
    }

    public static Clientes fromDTO(ClientesDTO dto){
        Clientes entity = new Clientes();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setEndereco(dto.getEndereco());
        entity.setBairro(dto.getBairro());
        entity.setTelefone(dto.getTelefone());
        entity.setCelular(dto.getCelular());
        entity.setEmail(dto.getEmail());
        entity.setCpf(dto.getCpf());
        //entity.setCidade(dto.getCidade());
        return entity;
    }
}

