package com.gustavocamargo.desafioremessa.infrastructure.persistence.adapter;

import com.gustavocamargo.desafioremessa.application.dto.response.UsuarioResponse;
import com.gustavocamargo.desafioremessa.domain.entity.Usuario;
import com.gustavocamargo.desafioremessa.domain.repository.UsuarioRepositoryPort;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper.UsuarioMapper;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.repository.UsuarioJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioJpaRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioRepositoryAdapter(UsuarioJpaRepository repository, UsuarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return false;
    }

    @Override
    public boolean existsByCnpj(String cnpj) {
        return false;
    }

    @Override
    public UsuarioResponse save(Usuario usuario) {
        return null;
    }
}
