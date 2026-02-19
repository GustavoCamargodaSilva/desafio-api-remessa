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
    private BigDecimal valor;
    private Moeda moedaOrigem;
    private BigDecimal valorConvertido;
    private Moeda moedaDestino;
    private BigDecimal cotacaoUtilizada;
    private StatusRemessa status;
    private LocalDateTime createdAt;

    public Remessa() {
    }

    public Remessa(UUID id, String idempotencyKey, UUID usuarioOrigemId, UUID usuarioDestinoId, BigDecimal valor, Moeda moedaOrigem, BigDecimal valorConvertido, Moeda moedaDestino, BigDecimal cotacaoUtilizada, StatusRemessa status, LocalDateTime createdAt) {
        this.id = id;
        this.idempotencyKey = idempotencyKey;
        this.usuarioOrigemId = usuarioOrigemId;
        this.usuarioDestinoId = usuarioDestinoId;
        this.valor = valor;
        this.moedaOrigem = moedaOrigem;
        this.valorConvertido = valorConvertido;
        this.moedaDestino = moedaDestino;
        this.cotacaoUtilizada = cotacaoUtilizada;
        this.status = status;
        this.createdAt = createdAt;
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

    public UUID getUsuarioDestinoId() {
        return usuarioDestinoId;
    }

    public void setUsuarioDestinoId(UUID usuarioDestinoId) {
        this.usuarioDestinoId = usuarioDestinoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Moeda getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(Moeda moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public BigDecimal getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(BigDecimal valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public Moeda getMoedaDestino() {
        return moedaDestino;
    }

    public void setMoedaDestino(Moeda moedaDestino) {
        this.moedaDestino = moedaDestino;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
