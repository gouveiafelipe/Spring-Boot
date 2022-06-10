package com.example.Spring.Boot.mapstruct.dtos;

import com.example.Spring.Boot.entities.enums.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountPostDto {

    private Long id;

    private BigDecimal saldo;

    private int accountType;

    public AccountPostDto() {
    }


    public void setAccountType(AccountType accountType) {
        this.accountType = accountType.getAccountType();
    }

    public AccountType getAccountType() {
        return AccountType.valueOf(accountType);
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

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
}
