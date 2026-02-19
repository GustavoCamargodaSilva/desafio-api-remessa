package com.gustavocamargo.desafioremessa.infrastructure.persistence.entity;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "carteira")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarteiraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column (nullable = false)
    private BigDecimal saldo;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private UUID usuarioId;

    private Moeda moeda;

    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }

}
