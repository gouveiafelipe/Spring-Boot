package com.example.Spring.Boot.services.impl;


import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.mapstruct.dtos.ClientGetDto;
import com.example.Spring.Boot.mapstruct.dtos.ClientPostDto;
import com.example.Spring.Boot.mapstruct.mapper.ClienteMapper;
import com.example.Spring.Boot.repositories.ClienteRepository;
import com.example.Spring.Boot.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServicesImplementations implements ClienteServices {


    @Autowired
    private ClienteMapper clienteMapper;

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ClientGetDto> listClients() {

       return clienteMapper.clientToClientGetDtos(clienteRepository.findAll());

    }

    /**
     * @param clientPostDto
     * @return
     */
    @Override
    public ClientGetDto clientRegister(ClientPostDto clientPostDto) {
        Cliente cliente = clienteMapper.clientPostDtoToClient(clientPostDto);
        return  clienteMapper.clientToClientGetDto(clienteRepository.save(cliente));
    }



    @Override
    public ClientGetDto listClientId(Long id) {
        return clienteMapper.clientToClientGetDto(clienteRepository.findById(id).get());
    }


//    @Override
//    public Cliente clientUpdate(Long id, Cliente cliente) {
//        Cliente cliente1 = clienteRepository.findById(id).get();
//        cliente1.setCpf(cliente.getCpf());
//        cliente1.setNome(cliente.getNome());
//        return clienteRepository.save(cliente1);
//    }

//    private ClienteDto convertEntityToDto(Cliente cliente){
//        ClienteDto clienteDto
//    }
}
