package io.github.AdenilsonDevelopers.clientes.model.repository;

import io.github.AdenilsonDevelopers.clientes.model.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
