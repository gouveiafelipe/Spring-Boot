package br.com.itau.repositories;

import br.com.itau.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNomeCliente(String nomeCliente);

}
