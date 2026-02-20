package com.gustavocamargo.desafioremessa.application.dto.response;

import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;

import java.time.LocalDateTime;
import java.util.UUID;

public record UsuarioResponse(

        UUID id,
        String nomeCompleto,
        String email,
        TipoUsuario tipoUsuario,
        LocalDateTime dataCriacao
) {
}
