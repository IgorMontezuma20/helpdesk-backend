package com.IgorMontezuma20.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IgorMontezuma20.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
