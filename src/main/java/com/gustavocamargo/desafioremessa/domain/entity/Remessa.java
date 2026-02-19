package com.gustavocamargo.desafioremessa.domain.entity;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import com.gustavocamargo.desafioremessa.domain.enums.StatusRemessa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Remessa {

    private UUID id;
    private String idempotencyKey;
    private UUID usuarioOrigemId;
    private UUID usuarioDestinoId;
    private BigDecimal valorOrigem;
    private Moeda moedaOrigem;
    private Moeda moedaDestino;
    private BigDecimal valorConvertido;
    private BigDecimal cotacaoUtilizada;

    private StatusRemessa status;
    private LocalDateTime dataCriacao;

    public Remessa() { }

    public Remessa(UUID id, String idempotencyKey, UUID usuarioOrigemId, UUID usuarioDestinoId, BigDecimal valorOrigem, Moeda moedaOrigem, Moeda moedaDestino, BigDecimal valorConvertido, BigDecimal cotacaoUtilizada, StatusRemessa status, LocalDateTime dataCriacao) {
        this.id = id;
        this.idempotencyKey = idempotencyKey;
        this.usuarioOrigemId = usuarioOrigemId;
        this.usuarioDestinoId = usuarioDestinoId;
        this.valorOrigem = valorOrigem;
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorConvertido = valorConvertido;
        this.cotacaoUtilizada = cotacaoUtilizada;
        this.status = status;
        this.dataCriacao = dataCriacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public UUID getUsuarioOrigemId() {
        return usuarioOrigemId;
    }

    public void setUsuarioOrigemId(UUID usuarioOrigemId) {
        this.usuarioOrigemId = usuarioOrigemId;
    }

    public BigDecimal getValorOrigem() {
        return valorOrigem;
    }

    public void setValorOrigem(BigDecimal valorOrigem) {
        this.valorOrigem = valorOrigem;
    }

    public UUID getUsuarioDestinoId() {
        return usuarioDestinoId;
    }

    public void setUsuarioDestinoId(UUID usuarioDestinoId) {
        this.usuarioDestinoId = usuarioDestinoId;
    }

    public Moeda getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(Moeda moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public Moeda getMoedaDestino() {
        return moedaDestino;
    }

    public void setMoedaDestino(Moeda moedaDestino) {
        this.moedaDestino = moedaDestino;
    }

    public BigDecimal getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(BigDecimal valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public BigDecimal getCotacaoUtilizada() {
        return cotacaoUtilizada;
    }

    public void setCotacaoUtilizada(BigDecimal cotacaoUtilizada) {
        this.cotacaoUtilizada = cotacaoUtilizada;
    }

    public StatusRemessa getStatus() {
        return status;
    }

    public void setStatus(StatusRemessa status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
