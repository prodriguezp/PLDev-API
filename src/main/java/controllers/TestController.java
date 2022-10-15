package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Test;

@RestController
@RequestMapping("api")
public class TestController {

	
	public TestController() {
		System.out.println("TEST");
	}
	
	@GetMapping("/test")
	public List<Test> getTest() {
		
		List<Test> list = new ArrayList();
		
		list.add(new Test("hola"));
		list.add(new Test("hola1"));
		list.add(new Test("hola2"));
		list.add(new Test("hola3"));

		return list;
	}
}
