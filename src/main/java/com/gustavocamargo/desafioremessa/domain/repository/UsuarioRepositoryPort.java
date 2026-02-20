package com.gustavocamargo.desafioremessa.domain.repository;

import com.gustavocamargo.desafioremessa.application.dto.response.UsuarioResponse;
import com.gustavocamargo.desafioremessa.domain.entity.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public interface UsuarioRepositoryPort {

    boolean existsByEmail(@Email @NotBlank String email);

    boolean existsByCpf(@CPF String cpf);

    boolean existsByCnpj(@CNPJ String cnpj);

    UsuarioResponse save(Usuario usuario);
}
