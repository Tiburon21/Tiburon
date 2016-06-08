package com.diamond.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.diamond.Application;
import com.diamond.domain.Evento;
import com.diamond.domain.EventoRepository;
import com.diamond.domain.Visitante;
import com.diamond.domain.VisitanteRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class VisitanteTest {
	
	@Autowired
	VisitanteRepository visitanteRepository;
	
//	@Autowired
//	EventoRepository eventoRepository;
	
	@Test
	public void guardarVisitanteTest(){
//		Evento evento = new Evento();
//		evento.setIdEvento(1);
//		
//		Visitante visitante = new Visitante();
//		visitante.setNombre("Vanesa");
//		visitante.setApellidoPaterno("Galicia");
//		visitante.setApellidoMaterno("Galvan");
//		visitante.setFechaNac("02-OCT-10");
//		visitante.setEmail("VaneG@gmail.com");
//		visitante.setTelefono(5612218);
//		//visitante.setEventos(eventos);
//		visitanteRepository.save(visitante);
	}

}
