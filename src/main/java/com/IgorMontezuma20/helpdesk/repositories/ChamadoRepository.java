package com.IgorMontezuma20.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IgorMontezuma20.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
