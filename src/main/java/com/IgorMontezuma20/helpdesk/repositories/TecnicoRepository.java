package com.IgorMontezuma20.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.IgorMontezuma20.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
