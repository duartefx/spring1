package com.senai.GiovanaD.Cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.GiovanaD.Cliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
