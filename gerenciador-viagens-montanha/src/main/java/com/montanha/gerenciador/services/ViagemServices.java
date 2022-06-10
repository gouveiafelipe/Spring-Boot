package com.montanha.gerenciador.services;

import com.montanha.gerenciador.dto.ViagemDto;
import com.montanha.gerenciador.entities.Viagem;
import com.montanha.gerenciador.exceptions.ViagemServiceException;
import com.montanha.gerenciador.repositories.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ViagemServices {

    @Autowired
    private ViagemRepository viagemRepository;

    public List <Viagem> listar(){
        return viagemRepository.findAll();

    }

    public Viagem salvar(ViagemDto viagemDto){

        Viagem viagem = new Viagem();

        viagem.setLocalDestino(viagemDto.getLocalDestino());
        viagem.setAcompanhante(viagemDto.getAcompanhante());
        viagem.setDataPartida(viagemDto.getDataPartida());
        viagem.setDataRetorno(viagemDto.getDataRetorno());

        return viagemRepository.save(viagem);

    }

    public Viagem buscar(Long id){
        Viagem viagem = viagemRepository.getById(id);

        if (viagem == null) {
            throw new ViagemServiceException("Não existe esta viagem cadastrada");
        }
        return viagem;


    }

}
