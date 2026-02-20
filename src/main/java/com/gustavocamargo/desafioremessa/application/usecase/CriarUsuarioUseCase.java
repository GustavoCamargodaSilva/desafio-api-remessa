package com.gustavocamargo.desafioremessa.application.usecase;

import com.gustavocamargo.desafioremessa.application.dto.request.CriarUsuarioRequest;
import com.gustavocamargo.desafioremessa.application.dto.response.UsuarioResponse;
import com.gustavocamargo.desafioremessa.domain.entity.Usuario;
import com.gustavocamargo.desafioremessa.domain.enums.TipoUsuario;
import com.gustavocamargo.desafioremessa.domain.exception.UsuarioJaExisteException;
import com.gustavocamargo.desafioremessa.domain.repository.UsuarioRepositoryPort;
import com.gustavocamargo.desafioremessa.infrastructure.persistence.mapper.UsuarioMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CriarUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;
    private final UsuarioMapper usuarioMapper;
    private final PasswordEncoder passwordEncoder;

    public CriarUsuarioUseCase(UsuarioRepositoryPort usuarioRepositoryPort, UsuarioMapper usuarioMapper, PasswordEncoder passwordEncoder) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
        this.usuarioMapper = usuarioMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public UsuarioResponse criarUsuario(CriarUsuarioRequest request) {
        validarDocumento(request);
        validarDuplicidades(request);
        Usuario usuario = converteRequestToEntity(request);
        return usuarioRepositoryPort.save(usuario);
    }

    private void validarDocumento(CriarUsuarioRequest request) {
        if (request.tipoUsuario() == TipoUsuario.PF && request.cpf() == null) {
            throw new IllegalArgumentException("O campo 'documento' é obrigatório.");
        }

        if (request.tipoUsuario() == TipoUsuario.PJ && request.cnpj() == null) {
            throw new IllegalArgumentException("O campo 'documento' é obrigatório.");
        }
    }

    private void validarDuplicidades(CriarUsuarioRequest request) {
        if (usuarioRepositoryPort.existsByEmail(request.email())) {
            throw new UsuarioJaExisteException("O email já está em uso.");
        }

        if (request.tipoUsuario() == TipoUsuario.PF && usuarioRepositoryPort.existsByCpf(request.cpf())) {
            throw new UsuarioJaExisteException("O CPF já está em uso.");
        }

        if (request.tipoUsuario() == TipoUsuario.PJ && usuarioRepositoryPort.existsByCnpj(request.cnpj())) {
            throw new UsuarioJaExisteException("O CNPJ já está em uso.");
        }
    }

    private Usuario converteRequestToEntity(CriarUsuarioRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto(request.nomeCompleto());
        usuario.setEmail(request.email());
        usuario.setSenha(passwordEncoder.encode(request.senha()));
        usuario.setCpf(request.cpf());
        usuario.setCnpj(request.cnpj());
        usuario.setTipoUsuario(request.tipoUsuario());
        return usuario;
    }
}
