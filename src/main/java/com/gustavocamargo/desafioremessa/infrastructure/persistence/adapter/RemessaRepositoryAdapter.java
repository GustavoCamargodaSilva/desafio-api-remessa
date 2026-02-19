package com.gustavocamargo.desafioremessa.infrastructure.persistence.adapter;

import com.gustavocamargo.desafioremessa.domain.repository.RemessaRepositoryPort;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper.RemessaMapper;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.repository.RemessaJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class RemessaRepositoryAdapter implements RemessaRepositoryPort {

    private final RemessaJpaRepository repository;
    private final RemessaMapper mapper;

    public RemessaRepositoryAdapter(RemessaJpaRepository repository, RemessaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
