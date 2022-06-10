package com.example.Spring.Boot.mapstruct.dtos;

import lombok.Data;

@Data
public class ClientGetAccountsDto {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
