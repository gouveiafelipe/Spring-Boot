package com.montanha.gerenciador.repositories;

import com.montanha.gerenciador.entities.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

    Viagem findByLocalDestino(String localDestino);

}
