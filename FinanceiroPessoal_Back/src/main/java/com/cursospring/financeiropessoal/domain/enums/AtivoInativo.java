package com.cursospring.financeiropessoal.domain.enums;

public enum AtivoInativo {

    ATIVO (0, "ATIVO"), INATIVO (1, "INATIVO");

    private Integer codigo;
    private String descricao;

    AtivoInativo(Integer codigo, String descricao) {
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

    public static AtivoInativo toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (AtivoInativo x : AtivoInativo.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de AtivoInativo inválido");
    }
}
