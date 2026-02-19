package com.gustavocamargo.desafioremessa.domain.exception;

public class LimiteDiarioExcedidoException extends RuntimeException {
    public LimiteDiarioExcedidoException(String message) {
        super(message);
    }
}
