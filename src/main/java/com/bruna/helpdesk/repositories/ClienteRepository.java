package com.bruna.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
