package com.gustavocamargo.desafioremessa.domain.entity;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Carteira {

    private UUID id;
    private UUID usuarioId;
    private BigDecimal saldo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    private Moeda moeda;

    public Carteira() { }

    public Carteira(UUID id, UUID usuarioId, BigDecimal saldo, LocalDateTime dataCriacao, LocalDateTime dataAtualizacao, Moeda moeda) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.moeda = moeda;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

}
