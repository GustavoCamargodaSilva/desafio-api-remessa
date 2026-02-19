package com.gustavocamargo.desafioremessa.domain.entity;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import com.gustavocamargo.desafioremessa.domain.enums.StatusRemessa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
