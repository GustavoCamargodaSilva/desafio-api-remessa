package com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper;

import com.gustavocamargo.desafioremessa.domain.entity.Usuario;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.entity.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toDomain(UsuarioEntity entity);
    UsuarioEntity toEntity(Usuario domain);
}
