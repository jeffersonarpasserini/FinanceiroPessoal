package com.cursospring.financeiropessoal.domain;

public class Banco {

    private Integer serial;
    private String descricao;

    public Banco() { }

    public Banco(Integer serial, String descricao) {
        this.serial = serial;
        this.descricao = descricao;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
