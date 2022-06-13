package com.example.Spring.Boot.mapstruct.dtos;

import com.example.Spring.Boot.entities.Conta;
import com.example.Spring.Boot.entities.enums.AccountType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Setter
@Getter
public class AccountPostDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal saldo;

    private int accountType;

    private Conta contas;

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
