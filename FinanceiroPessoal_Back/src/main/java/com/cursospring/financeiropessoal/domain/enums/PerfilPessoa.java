package com.cursospring.financeiropessoal.domain.enums;

public enum PerfilPessoa {

    FonteDebito (0, "FONTE_DEBITO"), FonteCredito (1, "FONTE_CREDITO");

    private Integer codigo;
    private String descricao;

    PerfilPessoa(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static PerfilPessoa toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (PerfilPessoa x : PerfilPessoa.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de Tipo de Movimento inválido");
    }
}
