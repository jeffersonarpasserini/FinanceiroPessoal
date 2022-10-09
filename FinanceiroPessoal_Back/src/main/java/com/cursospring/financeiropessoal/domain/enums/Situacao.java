package com.cursospring.financeiropessoal.domain.enums;

public enum Situacao {

    Previsao (0, "PREVISAO"), Confirmado (1, "CONFIRMADO"), Pago (2, "PAGO"), Conciliado (3, "CONCILIADO");

    private Integer codigo;
    private String descricao;

    Situacao(Integer codigo, String descricao) {
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

    public static Situacao toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (Situacao x : Situacao.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de Situação inválido");
    }
}
