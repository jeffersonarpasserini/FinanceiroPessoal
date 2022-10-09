package com.cursospring.financeiropessoal.domain;

import com.cursospring.financeiropessoal.domain.enums.PerfilPessoa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Pessoa {


    protected Integer id;
    protected String nomeRazaoSocial;
    protected String apelidoNomeFantasia;
    protected String cpfCnpj;
    protected Set<Integer> perfis = new HashSet<>();

    public Pessoa(){
        super();
    }

    public Pessoa(Integer id, String nomeRazaoSocial, String apelidoNomeFantasia, String cpfCnpj) {
        this.id = id;
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.apelidoNomeFantasia = apelidoNomeFantasia;
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getApelidoNomeFantasia() {
        return apelidoNomeFantasia;
    }

    public void setApelidoNomeFantasia(String apelidoNomeFantasia) {
        this.apelidoNomeFantasia = apelidoNomeFantasia;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Set<PerfilPessoa> getPerfis() {
        return perfis.stream().map(x -> PerfilPessoa.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(PerfilPessoa perfilPessoa) {
        this.perfis.add(perfilPessoa.getCodigo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(cpfCnpj, pessoa.cpfCnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpfCnpj);
    }
}
