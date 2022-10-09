package com.cursospring.financeiropessoal.domain;

import com.cursospring.financeiropessoal.domain.enums.PerfilUsuario;

import java.util.Set;
import java.util.stream.Collectors;

public class Usuario {

    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private Set<Integer> perfis;

    public Usuario() {

    }

    public Usuario(Integer id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<PerfilUsuario> getPerfis() {
        return perfis.stream().map(x -> PerfilUsuario.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(PerfilUsuario perfilUsuario) {
        this.perfis.add(perfilUsuario.getCodigo());
    }

}
