package com.example.Spring.Boot.services.impl;


import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.repositories.ClienteRepository;
import com.example.Spring.Boot.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicesImplementations implements ClienteServices {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listClients() {
        return clienteRepository.findAll();
    }


    @Override
    public Cliente clientRegister(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente listClientId(Long id) {
        return clienteRepository.findById(id).get();
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
