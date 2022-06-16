package com.example.Spring.Boot.services.impl;

import com.example.Spring.Boot.entities.Cliente;
import com.example.Spring.Boot.mapstruct.dtos.AccountGetDto;
import com.example.Spring.Boot.mapstruct.dtos.AccountPostDto;
import com.example.Spring.Boot.mapstruct.dtos.AccountUpdateDto;
import com.example.Spring.Boot.entities.Conta;

import com.example.Spring.Boot.mapstruct.mapper.ContaMapper;

import com.example.Spring.Boot.repositories.ClienteRepository;
import com.example.Spring.Boot.repositories.ContaRepository;
import com.example.Spring.Boot.services.ContaServices;
import com.example.Spring.Boot.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaServicesImplementations implements ContaServices {

    @Autowired
    ContaRepository contaRepository;


    @Autowired
    private ContaMapper contaMapper;

    @Autowired
    private ClienteRepository clienteRepository;


    public ContaServicesImplementations(ClienteServicesImplementations clienteServicesImplementations) {
    }

    @Override
    public List<AccountGetDto> listAllBankAccounts() {
        return contaMapper.accountToAccountGetDtos(contaRepository.findAll());

    }

    @Override
    public List<AccountGetDto> listBankAccountWithClientId(Long id) throws ResourceNotFoundException{

        List<AccountGetDto> list = contaMapper.accountToAccountGetDtos(contaRepository.findByFkClient(id));

        Optional<List<AccountGetDto>> obj = Optional.of(list);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
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
    public AccountGetDto accountCreate(Long id, AccountPostDto accountPostDto) {
        Cliente cliente = clienteRepository.findById(id).get();
        Conta conta = contaMapper.accountPostDtoToAccount(accountPostDto);
        conta.setCliente(cliente);
        contaRepository.save(conta);
        cliente.getContas().add(conta);
        return contaMapper.accountToAccountGetDto(conta);


    }
}
