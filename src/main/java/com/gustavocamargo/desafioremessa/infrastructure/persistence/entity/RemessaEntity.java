package com.gustavocamargo.desafioremessa.infrastructure.persistence.entity;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import com.gustavocamargo.desafioremessa.domain.enums.StatusRemessa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "remessa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemessaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String idempotencyKey;

    @Column(nullable = false)
    private UUID usuarioOrigemId;

    @Column(nullable = false)
    private UUID usuarioDestinoId;

    @Column(nullable = false)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Moeda moedaOrigem;

    @Column(nullable = false)
    private BigDecimal valorConvertido;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Moeda moedaDestino;

    @Column(nullable = false)
    private BigDecimal cotacaoUtilizada;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusRemessa status;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();
    }
}
