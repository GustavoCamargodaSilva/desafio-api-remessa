package com.gustavocamargo.desafioremessa.infrastructure.persistence.adapter;

import com.gustavocamargo.desafioremessa.domain.repository.CarteiraRepositoryPort;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper.CarteiraMapper;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.repository.CarteiraJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class CarteiraRepositoryAdapter implements CarteiraRepositoryPort {

    private final CarteiraJpaRepository repository;
    private final CarteiraMapper mapper;

    public CarteiraRepositoryAdapter(CarteiraJpaRepository repository, CarteiraMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
