package com.example.Spring.Boot.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
public class ClientPostDto {


    private Long id;

    @NotBlank(message = "Nome precisa ser informado")
    @Length(message = "Campo nome precisa ter mais que 3 caracteres", min = 3)
    @JsonProperty("nome")
    private String nome;

    @NotBlank(message = "CPF precisa ser ifnromado")
    @Length(message = "Campo cpf precisa ter 11 digitos", min = 11, max = 11)
    @JsonProperty("cpf")
    private String cpf;


//

    public ClientPostDto() {
    }

    public ClientPostDto    (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
