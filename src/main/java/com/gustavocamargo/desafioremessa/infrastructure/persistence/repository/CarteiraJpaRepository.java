package com.gustavocamargo.desafioremessa.infrastructure.persistence.repository;

import com.gustavocamargo.desafioremessa.infrastructure.persistence.entity.CarteiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarteiraJpaRepository extends JpaRepository<CarteiraEntity, UUID> {
}
