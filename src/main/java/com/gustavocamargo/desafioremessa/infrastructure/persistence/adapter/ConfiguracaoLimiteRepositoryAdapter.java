package com.gustavocamargo.desafioremessa.infrastructure.persistence.adapter;

import com.gustavocamargo.desafioremessa.domain.repository.ConfiguracaoLimiteRepositoryPort;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper.ConfiguracaoLimiteMapper;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.repository.ConfiguracaoLimiteJpaRepository;

public class ConfiguracaoLimiteRepositoryAdapter implements ConfiguracaoLimiteRepositoryPort {

    private final ConfiguracaoLimiteJpaRepository repository;
    private final ConfiguracaoLimiteMapper mapper;

    public ConfiguracaoLimiteRepositoryAdapter(ConfiguracaoLimiteJpaRepository repository, ConfiguracaoLimiteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
