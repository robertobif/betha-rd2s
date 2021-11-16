package com.rd2s.projeto.model;


import com.rd2s.projeto.enterprise.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CLIENTES ")
public class Clientes extends AbstractEntity {

    @Column(name = "NOME")
    @NotNull
    @Size(max = 100, message = "Nome não pode ter mais que 100 caracteres.")
    private String Nome;

    @Column(name = "ENDERECO")
    @NotNull
    @Size(max = 100, message = "Endereço não pode ter mais que 100 caracteres.")
    private String endereco;

    @ManyToOne
    @JoinColumn(name="I_CIDADE",referencedColumnName = "ID")
    private Cidade cidade;

    @Column(name = "BAIRRO")
    @NotNull
    @Size(max = 50, message = "Bairro não pode ter mais que 50 caracteres.")
    private String bairro;

    @Column(name = "TELEFONE")
    @Size(max = 15, message = "Telefone não pode ter mais que 15 caracteres.")
    private String telefone;

    @Column(name = "N")
    @NotNull
    @Size(max = 50, message = "Celular não pode ter mais que 50 caracteres.")
    private String celular;

    @Column(name = "email")
    @Size(max = 50, message = "E-mail não pode ter mais que 50 caracteres.")
    private String email;

    @Column(name = "CPF")
    @NotNull
    @Size(max = 13, message = "CPF não pode ter mais que 13 caracteres.")
    private String cpf;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
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

    @Override
    public String toString() {
        return "Clientes{" +
                "Nome='" + Nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade=" + cidade +
                ", bairro='" + bairro + '\'' +
                ", telefone='" + telefone + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}