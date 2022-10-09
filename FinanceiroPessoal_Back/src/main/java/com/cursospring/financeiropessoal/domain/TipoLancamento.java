package com.cursospring.financeiropessoal.domain;

public class TipoLancamento {

    private Integer id;
    private String descricao;
    private GrupoLancamento grupoLancamento;

    public TipoLancamento() {
    }

    public TipoLancamento(Integer id, String descricao, GrupoLancamento grupoLancamento) {
        this.id = id;
        this.descricao = descricao;
        this.grupoLancamento = grupoLancamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GrupoLancamento getGrupoLancamento() {
        return grupoLancamento;
    }

    public void setGrupoLancamento(GrupoLancamento grupoLancamento) {
        this.grupoLancamento = grupoLancamento;
    }
}
