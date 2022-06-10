package com.example.Spring.Boot.mapstruct.mapper;

import com.example.Spring.Boot.entities.Conta;
import com.example.Spring.Boot.mapstruct.dtos.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContaMapper {
    @InheritInverseConfiguration
    Conta accountPostDtoToAccount(AccountPostDto accountPostDto);

    @InheritInverseConfiguration
    AccountGetDto accountToAccountGetDto(Conta conta);
    @InheritInverseConfiguration
    Conta accountUpdateDtoToAccount(AccountUpdateDto accountUpdateDto);

    @InheritInverseConfiguration
    List<AccountGetDto> accountToAccountGetDtos(List<Conta> conta);
}
