package com.montanha.gerenciador.exceptions;

public class ViagemServiceException extends RuntimeException {

    private static final long serialVersionUID = -1402677565107062800L;

    public ViagemServiceException(String mensagem) {
        super(mensagem);
    }
}
