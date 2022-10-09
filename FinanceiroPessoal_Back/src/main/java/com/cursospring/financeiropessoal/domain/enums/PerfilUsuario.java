package com.cursospring.financeiropessoal.domain.enums;

public enum PerfilUsuario {

    Administrador (0, "ROLE_ADMINISTRADOR"), Usuario (1, "ROLE_USUARIO");

    private Integer codigo;
    private String descricao;

    PerfilUsuario(Integer codigo, String descricao) {
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

    public static PerfilUsuario toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }

        for (PerfilUsuario x : PerfilUsuario.values()){
            if (codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Código de Perfil Usuario inválido");
    }
}
