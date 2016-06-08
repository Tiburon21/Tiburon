package com.diamond.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.diamond.Application;
import com.diamond.domain.Evento;
import com.diamond.domain.EventoRepository;
import com.diamond.domain.Organizador;
import com.diamond.domain.OrganizadorRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class EventoTest {
	
	@Autowired
	EventoRepository eventoRepository;
	
	@Autowired
	OrganizadorRepository organizadorRepository;
	@Test
	public void guardarEventoTest(){
		Organizador organizador = new Organizador();
		organizador.setIdOrganizador(1);
		
		Evento evento = new Evento();
		evento.setNombreEvento("ACER");
		evento.setSalon(1);
		evento.setFechaEvento(new Date());
		evento.setOrganizador(organizador);
		
		eventoRepository.save(evento);
	}
	

}
