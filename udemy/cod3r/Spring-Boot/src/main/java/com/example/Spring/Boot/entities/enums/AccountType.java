package com.example.Spring.Boot.entities.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum AccountType {
    POUPANÇA(1),
    CORRENTE(2),
    INVESTIMENTOS(3),
    APOSENTADORIA(4);

    private final int accountType;

    AccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getAccountType() {
        return accountType;
    }

    public static AccountType valueOf(int accountType){
        for (AccountType x: AccountType.values()){
            if (x.getAccountType() == accountType){
                return x;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
