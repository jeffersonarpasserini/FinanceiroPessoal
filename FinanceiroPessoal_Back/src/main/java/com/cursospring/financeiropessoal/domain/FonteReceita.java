package com.cursospring.financeiropessoal.domain;

public class FonteReceita extends Pessoa {

    private Integer idFonteReceita;
    private String email;
    private String telefone;
    private String observacao;

    public FonteReceita(Integer id, String nomeRazaoSocial, String apelidoNomeFantasia, String cpfCnpj, Integer idFonteReceita, String email, String telefone, String observacao) {
        super(id, nomeRazaoSocial, apelidoNomeFantasia, cpfCnpj);
        this.idFonteReceita = idFonteReceita;
        this.email = email;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public Integer getIdFonteReceita() {
        return idFonteReceita;
    }

    public void setIdFonteReceita(Integer idFonteReceita) {
        this.idFonteReceita = idFonteReceita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
