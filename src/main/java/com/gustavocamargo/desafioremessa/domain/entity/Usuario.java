package com.gustavocamargo.desafioremessa.domain.entity;

import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private UUID id;
    private String nomeCompleto;
    private String email;
    private String senha;
    private String cpf;
    private String cnpj;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    private TipoUsuario tipoUsuario;
}
