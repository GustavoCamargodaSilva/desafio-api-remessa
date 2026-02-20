package com.gustavocamargo.desafioremessa.application.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CotacaoResponse(
        BigDecimal cotacaoCompra,
        LocalDateTime dataHoraCotacao
) {
}
