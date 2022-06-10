package br.com.itau.exceptions;

public class ClienteException extends RuntimeException{

    private static final long serialVersionUID = -1402677565107062800L;

    public ClienteException(String message) {super(message);}
}
