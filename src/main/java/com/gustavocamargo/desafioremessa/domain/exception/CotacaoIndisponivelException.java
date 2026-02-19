package com.gustavocamargo.desafioremessa.domain.exception;

public class CotacaoIndisponivelException extends RuntimeException {
    public CotacaoIndisponivelException(String message) {
        super(message);
    }
}
