package com.gustavocamargo.desafioremessa.domain.entity;

import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class ConfiguracaoLimite {

    private UUID id;
    private BigDecimal limiteDiario;
    private Boolean ativo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private TipoUsuario tipoUsuario;

    public ConfiguracaoLimite() { }

    public ConfiguracaoLimite(UUID id, BigDecimal limiteDiario, Boolean ativo, LocalDateTime createdAt, LocalDateTime updatedAt, TipoUsuario tipoUsuario) {
        this.id = id;
        this.limiteDiario = limiteDiario;
        this.ativo = ativo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tipoUsuario = tipoUsuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(BigDecimal limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
