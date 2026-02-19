package com.gustavocamargo.desafioremessa.infrastructure.persistence.adapter;

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
}
