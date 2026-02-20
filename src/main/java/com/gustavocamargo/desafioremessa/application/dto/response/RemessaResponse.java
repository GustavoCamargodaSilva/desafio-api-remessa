package com.gustavocamargo.desafioremessa.application.dto.response;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import com.gustavocamargo.desafioremessa.domain.enums.StatusRemessa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record RemessaResponse(
        UUID id,
        UUID usuarioOrigemId,
        UUID usuarioDestinoId,
        BigDecimal valor,
        Moeda moedaOrigem,
        BigDecimal valorConvertido,
        Moeda moedaDestino,
        BigDecimal cotacaoUtilizada,
        StatusRemessa status,
        LocalDateTime dataCriacao
) {}
