package br.com.itau.dto;



import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ClienteDto implements Serializable {

    private static final long serialVersionUID = -8105241933692707649L;

    private Long id;

    private String nomeCliente;

    private String cpfCliente;

    public ClienteDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @NotNull(message = "Cpf é obrigatorio")
    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
