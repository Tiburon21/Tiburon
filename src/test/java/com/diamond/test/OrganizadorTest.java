 package com.diamond.test;

import java.util.ArrayList;
import java.util.Collection;
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
import com.diamond.domain.Role;
import com.diamond.domain.RoleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class OrganizadorTest {
	
	@Autowired
	OrganizadorRepository organizadorRepository;
	
	@Autowired
	EventoRepository eventoRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Test
	public void guardarOrganizadorEventoTest(){
		Organizador organizador = new Organizador();
		organizador.setNombre("Ivonne");
		organizador.setApellidoPaterno("Perez");
		organizador.setApellidoMaterno("Contreras");
		organizador.setCalle("lomas de chapultepec");
		organizador.setColonia("valle gomez");
		organizador.setNumInt(9);
		organizador.setCp(15070);
		organizador.setEmail("ivonneAmor@outlook.com");
		organizador.setTelefono(56982132);
		organizador.setUsuario("IvonneAmor");
		organizador.setPassword("pulgas");
		
		Evento evento = new Evento();
		evento.setNombreEvento("UAsetFechaEventoCM");
		evento.setSalon(2);
		evento.setFechaEvento(new Date());
		evento.setOrganizador(organizador);//el join entre tablas para ejecutar la prueba
		
		Collection<Organizador> organizadores = new ArrayList<Organizador>();
		
		Role role = new Role();
		role.setNombreRole("administrador");
		role.setOrganizadores(organizadores);
		
		Collection<Role> roles = new ArrayList<Role>();
		roles.add(role);
		organizador.setRoles(roles);
		
		roleRepository.save(role); 
		organizadorRepository.save(organizador);
		eventoRepository.save(evento); 
		
		
			
		}
		
	}



