package com.cursospring.financeiropessoal.domain;

public class FonteDespesa extends Pessoa {

    private Integer idFonteDespesa;
    private String email;
    private String telefone;
    private String observacao;

    public FonteDespesa(Integer id, String nomeRazaoSocial, String apelidoNomeFantasia, String cpfCnpj, Integer idFonteDespesa, String email, String telefone, String observacao) {
        super(id, nomeRazaoSocial, apelidoNomeFantasia, cpfCnpj);
        this.idFonteDespesa = idFonteDespesa;
        this.email = email;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public Integer getIdFonteDespesa() {
        return idFonteDespesa;
    }

    public void setIdFonteDespesa(Integer idFonteDespesa) {
        this.idFonteDespesa = idFonteDespesa;
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
