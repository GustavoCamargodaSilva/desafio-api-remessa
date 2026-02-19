package com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper;

import com.gustavocamargo.desafioremessa.domain.entity.Carteira;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.entity.CarteiraEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarteiraMapper {

    Carteira toDomain(CarteiraEntity entity);
    CarteiraEntity toEntity(Carteira domain);
}
