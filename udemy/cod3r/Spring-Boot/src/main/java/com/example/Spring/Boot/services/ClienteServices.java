package com.example.Spring.Boot.services;


import com.example.Spring.Boot.mapstruct.dtos.ClientGetDto;
import com.example.Spring.Boot.mapstruct.dtos.ClientPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteServices {

     List<ClientGetDto> listClients();


    //Transformando um cliente dto em um cliente
     ClientGetDto clientRegister(ClientPostDto clientPostDto);

     ClientGetDto listClientId(Long id);




}
