package controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Proyecto;
import entities.Social;
import entities.Test;
import service.ProyectoService;
import service.SocialService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class PLDevController {

	
	private Logger LOG = LoggerFactory.getLogger(PLDevController.class);
	
	@Autowired
	private ProyectoService proyectoService;
	
	@Autowired
	private SocialService socialService;
	
	public PLDevController() {
		
	}
	
	@GetMapping("/proyectos")
	public ResponseEntity<?> getProyectos() {		
		List<Proyecto> list = proyectoService.findAll();
		LOG.info(list.toString());
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/socials")
	public ResponseEntity<?> getSocials() {		
		List<Social> list = socialService.findAll();
		LOG.info(list.toString());
		return ResponseEntity.ok(list);
	}
}
