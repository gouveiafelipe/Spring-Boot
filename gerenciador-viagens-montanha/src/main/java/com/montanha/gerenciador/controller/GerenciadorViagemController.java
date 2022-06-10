package com.montanha.gerenciador.controller;

import com.montanha.gerenciador.dto.ViagemDto;
import com.montanha.gerenciador.entities.Viagem;
import com.montanha.gerenciador.services.ViagemServices;
//import org.apache.catalina.connector.Response;
import com.montanha.gerenciador.responses.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/**
 *  a responsabilidade do controlador é simplesmente dizer aos outros componentes da aplicação que tem alguém querendo realizar um cadastro,
 *  e então ele simplesmente chama estes componentes para realizar a operação proposta.
 *  O Controlador não deve ter responsabilidades de processar ou persistir dados.
 */


@RestController
@RequestMapping("/api/viagens")
public class GerenciadorViagemController {

    @Autowired
    private ViagemServices viagemService;

    @PostMapping(path = "/new")
    public ResponseEntity<Response<Viagem>> cadastrar (@Valid @RequestBody ViagemDto viagemDto, BindingResult result){
        Response<Viagem> response = new Response<Viagem>();

        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }

        Viagem viagemSalva = this.viagemService.salvar(viagemDto);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(viagemDto.getId())
                    .toUri();
        response.setData(viagemSalva);
        return ResponseEntity.created(location).body(response);
    }

    @GetMapping
    public ResponseEntity<List<Viagem>> listar() {
        List<Viagem> viagens = viagemService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(viagens);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Response<Viagem>> buscar(@PathVariable("id") Long id) {

        Viagem viagem = viagemService.buscar(id);
        Response<Viagem> response = new Response<Viagem>();
        response.setData(viagem);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    }
