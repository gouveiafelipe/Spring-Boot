package com.example.Spring.Boot.mapstruct.dtos;

import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.entities.enums.AccountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Data
public class AccountGetDto {

    private Long id;

    private int accountType;

    private BigDecimal saldo;


    public AccountGetDto() {
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

    public AccountType getAccountType() {
        return AccountType.valueOf(accountType);
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType.getAccountType();
    }


}
