package com.gustavocamargo.desafioremessa.application.dto.request;

import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public record CriarUsuarioRequest(
        @NotBlank String nomeCompleto,
        @Email @NotBlank String email,
        @NotBlank String senha,
        @CPF String cpf,
        @CNPJ String cnpj,
        @NotNull TipoUsuario tipoUsuario
) {}