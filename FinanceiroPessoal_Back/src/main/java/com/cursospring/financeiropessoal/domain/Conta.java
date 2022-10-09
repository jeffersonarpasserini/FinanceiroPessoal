package com.cursospring.financeiropessoal.domain;

import com.cursospring.financeiropessoal.domain.enums.TipoConta;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {

    private Integer id;
    private String descricao;
    private String agencia;
    private String conta;
    private BigDecimal limite;
    private LocalDate dataSaldoInicial;
    private BigDecimal saldoInicial;
    private BigDecimal saldoAtual;
    private Integer diaFechamentoFatura;
    private Integer diaVencimentoFatura;
    private Banco banco;
    private TipoConta tipoConta;

    public Conta() {
        super();
    }

    public Conta(Integer id, String descricao, String agencia, String conta, BigDecimal limite, LocalDate dataSaldoInicial, BigDecimal saldoInicial, BigDecimal saldoAtual, Integer diaFechamentoFatura, Integer diaVencimentoFatura, Banco banco, TipoConta tipoConta) {
        this.id = id;
        this.descricao = descricao;
        this.agencia = agencia;
        this.conta = conta;
        this.limite = limite;
        this.dataSaldoInicial = dataSaldoInicial;
        this.saldoInicial = saldoInicial;
        this.saldoAtual = saldoAtual;
        this.diaFechamentoFatura = diaFechamentoFatura;
        this.diaVencimentoFatura = diaVencimentoFatura;
        this.banco = banco;
        this.tipoConta = tipoConta;
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

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public LocalDate getDataSaldoInicial() {
        return dataSaldoInicial;
    }

    public void setDataSaldoInicial(LocalDate dataSaldoInicial) {
        this.dataSaldoInicial = dataSaldoInicial;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(BigDecimal saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Integer getDiaFechamentoFatura() {
        return diaFechamentoFatura;
    }

    public void setDiaFechamentoFatura(Integer diaFechamentoFatura) {
        this.diaFechamentoFatura = diaFechamentoFatura;
    }

    public Integer getDiaVencimentoFatura() {
        return diaVencimentoFatura;
    }

    public void setDiaVencimentoFatura(Integer diaVencimentoFatura) {
        this.diaVencimentoFatura = diaVencimentoFatura;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
