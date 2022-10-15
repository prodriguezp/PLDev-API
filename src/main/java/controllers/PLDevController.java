package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Proyecto;
import entities.Test;
import service.ProyectoService;

@RestController
@RequestMapping("api")
public class PLDevController {

	@Autowired
	private ProyectoService service;
	
	public PLDevController() {
		
	}
	
	@GetMapping("/proyectos")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> getTest() {		
		List<Proyecto> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
