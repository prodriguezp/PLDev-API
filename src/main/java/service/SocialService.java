package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Proyecto;
import entities.Social;
import repository.ProyectoRepository;
import repository.SocialRepository;

@Service
public class SocialService {

	
	private final SocialRepository repository;

	public SocialService(SocialRepository repository) {
		this.repository = repository;
	}

	public List<Social> findAll() {
		return (List<Social>) repository.findAll();
	}
}
