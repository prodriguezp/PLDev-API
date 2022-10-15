package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Proyecto;
import repository.ProyectoRepository;

@Service
public class ProyectoService {

	
	private final ProyectoRepository repository;

	public ProyectoService(ProyectoRepository repository) {
		this.repository = repository;
	}

	public List<Proyecto> findAll() {
		return (List<Proyecto>) repository.findAll();
	}
}
