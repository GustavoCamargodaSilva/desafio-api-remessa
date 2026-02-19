package com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper;

import com.gustavocamargo.desafioremessa.domain.entity.ConfiguracaoLimite;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.entity.ConfiguracaoLimiteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConfiguracaoLimiteMapper {

    ConfiguracaoLimite toDomain(ConfiguracaoLimiteEntity entity);
    ConfiguracaoLimiteEntity toEntity(ConfiguracaoLimite domain);
}
