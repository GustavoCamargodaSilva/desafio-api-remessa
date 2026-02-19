package com.gustavocamargo.desafioremessa.domain.exception;

public class RemessaDuplicadaException extends RuntimeException {
    public RemessaDuplicadaException(String message) {
        super(message);
    }
}
