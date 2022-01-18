package io.github.AdenilsonDevelopers.clientes.repository;

import model.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
