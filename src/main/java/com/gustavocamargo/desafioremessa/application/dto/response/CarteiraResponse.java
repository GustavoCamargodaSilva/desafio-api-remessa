package com.gustavocamargo.desafioremessa.application.dto.response;

import com.gustavocamargo.desafioremessa.domain.enums.Moeda;
import java.math.BigDecimal;
import java.util.UUID;

public record CarteiraResponse(
        UUID id,
        Moeda moeda,
        BigDecimal saldo
) {
}
