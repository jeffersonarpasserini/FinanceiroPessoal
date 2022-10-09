package com.cursospring.financeiropessoal.domain.enums;

public enum TipoMovimento {

    Debito (0, "DEBITO"), Credito (1, "CREDITO"), Transferencia (2, "TRANSFERENCIA");

    private Integer codigo;
    private String descricao;

    TipoMovimento(Integer codigo, String descricao) {
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

    public static TipoMovimento toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (TipoMovimento x : TipoMovimento.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de Tipo de Movimento inválido");
    }
}
