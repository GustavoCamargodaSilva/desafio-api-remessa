package com.gustavocamargo.desafioremessa.infrastructure.persistence.entity;

import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "configuracao_limite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConfiguracaoLimiteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private BigDecimal limiteDiario;
    @Column(nullable = false)
    private Boolean ativo;
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;

    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }
}
