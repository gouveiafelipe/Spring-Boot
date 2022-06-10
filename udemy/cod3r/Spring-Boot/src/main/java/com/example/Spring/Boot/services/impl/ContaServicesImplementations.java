package com.example.Spring.Boot.services.impl;

import com.example.Spring.Boot.mapstruct.dtos.AccountPostDto;
import com.example.Spring.Boot.mapstruct.dtos.AccountUpdateDto;
import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.entities.Conta;
import com.example.Spring.Boot.repositories.ClienteRepository;
import com.example.Spring.Boot.repositories.ContaRepository;
import com.example.Spring.Boot.services.ContaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ContaServicesImplementations implements ContaServices {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    ClienteRepository clienteRepository;



    private final ClienteServicesImplementations clienteServicesImplementations;

    public ContaServicesImplementations(ClienteServicesImplementations clienteServicesImplementations) {
        this.clienteServicesImplementations = clienteServicesImplementations;
    }

    @Override
    public List<Conta> listAllBankAccounts() {
        return contaRepository.findAll();
    }

    @Override
    public List<Conta> listBankAccountWithClientId(Long id) {
        Cliente cliente = clienteRepository.findById(id).get();
        return contaRepository.findByFkClient(id);
    }

    @Override
    public Conta deposit(Long id, AccountUpdateDto accountUpdateDto) {
        return null;
    }

    @Override
    public Conta withdraw(Long id, BigDecimal saldo) {
        return null;
    }

    @Override
    public Conta accountCreate(Long id, AccountPostDto accountPostDto) {
        return null;
    }
}
