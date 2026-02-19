package com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper;

import com.gustavocamargo.desafioremessa.domain.entity.Remessa;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.entity.RemessaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RemessaMapper {

    Remessa toDomain(RemessaEntity entity);
    RemessaEntity toEntity(Remessa domain);
}
