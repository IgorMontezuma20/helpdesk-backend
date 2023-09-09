package com.IgorMontezuma20.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IgorMontezuma20.helpdesk.domain.Chamado;
import com.IgorMontezuma20.helpdesk.repositories.ChamadoRepository;
import com.IgorMontezuma20.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: " + id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
	}

}
