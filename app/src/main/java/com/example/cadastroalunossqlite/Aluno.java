package com.example.cadastroalunossqlite;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Integer id;
    private String nome;
    private String cpf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String telefone;

    @Override
    public String toString(){
        return nome;
    }

}
