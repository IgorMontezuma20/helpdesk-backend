package com.IgorMontezuma20.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IgorMontezuma20.helpdesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer>{

}
