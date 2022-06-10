package com.example.Spring.Boot.services;


import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.mapstruct.dtos.ClientGetDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteServices {

    public List<Cliente> listClients();


    //Transformando um cliente dto em um cliente
    public Cliente clientRegister(Cliente cliente);

//        Cliente cliente = new Cliente();
//
//        cliente.setCpf(clienteDto.getCpf());
//        cliente.setNome(clienteDto.getNome());
////        cliente.setId(clienteDto.getId());





    public Cliente listClientId(Long id);

//    public Cliente clientUpdate(Long id, Cliente cliente);

//        Cliente cliente = clienteRepository.findById(id).get();
//        cliente.getContas().add(conta);
//        clienteRepository.save(cliente);
//        return conta;


}
