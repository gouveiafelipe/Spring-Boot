package com.example.Spring.Boot.mapstruct.mapper;


import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.mapstruct.dtos.ClientGetDto;
import com.example.Spring.Boot.mapstruct.dtos.ClientPostDto;
import com.example.Spring.Boot.mapstruct.dtos.ClienteUpdateDto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ClienteMapper {


    Cliente clientPostDtoToClient(ClientPostDto clientPostDto);

    @InheritConfiguration
    ClientGetDto clientToClientGetDto(Cliente cliente);

    ClienteUpdateDto clientUpdateDtoToCliente(ClienteUpdateDto clienteUpdateDto);

    List<ClientGetDto> clientToClientGetDtos(List<Cliente> clientes);


}
