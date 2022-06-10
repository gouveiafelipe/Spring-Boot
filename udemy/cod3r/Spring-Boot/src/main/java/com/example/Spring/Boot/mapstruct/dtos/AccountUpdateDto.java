package com.example.Spring.Boot.mapstruct.dtos;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.*;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;


@Setter
@Getter
public class AccountUpdateDto {


    private Long id;

    @NotNull
    @PositiveOrZero
    private BigDecimal saldo;



    public AccountUpdateDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
