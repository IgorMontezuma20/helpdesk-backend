package com.IgorMontezuma20.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IgorMontezuma20.helpdesk.domain.Chamado;
import com.IgorMontezuma20.helpdesk.domain.Cliente;
import com.IgorMontezuma20.helpdesk.domain.Tecnico;
import com.IgorMontezuma20.helpdesk.domain.enums.Perfil;
import com.IgorMontezuma20.helpdesk.domain.enums.Prioridade;
import com.IgorMontezuma20.helpdesk.domain.enums.Status;
import com.IgorMontezuma20.helpdesk.repositories.ChamadoRepository;
import com.IgorMontezuma20.helpdesk.repositories.ClienteRepository;
import com.IgorMontezuma20.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Igor Montezuma", "625.748.097-34", "igor@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "547.883.187-50", "torvalds@mai.com", "123");

		Chamado c1 = new Chamado(null, "Chamado 01", "primeiro chamado", Prioridade.MEDIA, Status.ANDAMENTO, tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
