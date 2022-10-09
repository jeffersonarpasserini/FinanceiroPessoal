package com.cursospring.financeiropessoal.domain.enums;

public enum TipoConta {

    ContaCorrente (0, "CONTACORRENTE"), Poupanca (1, "POUPANCA"), Investimento (2, "INVESTIMENTO"), CartaoCredito (3, "CARTAOCREDITO");

    private Integer codigo;
    private String descricao;

    TipoConta(Integer codigo, String descricao) {
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

    public static TipoConta toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (TipoConta x : TipoConta.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de Tipo de Conta inválido");
    }
}
