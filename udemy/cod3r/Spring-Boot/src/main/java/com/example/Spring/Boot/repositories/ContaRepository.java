package com.example.Spring.Boot.repositories;

import com.example.Spring.Boot.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findByIdEquals(Long id);

    @Query("select c from Conta c where c.cliente.id = ?1")
    List<Conta> findByFkClient(Long id);








}
