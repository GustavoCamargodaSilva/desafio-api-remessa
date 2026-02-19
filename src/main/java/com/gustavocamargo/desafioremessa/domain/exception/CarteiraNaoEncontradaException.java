package com.gustavocamargo.desafioremessa.domain.exception;

public class CarteiraNaoEncontradaException extends RuntimeException {
    public CarteiraNaoEncontradaException(String message) {
        super(message);
    }
}
