package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CalculadoraController {
	
	@GetMapping("/menu")
	
	public String obtenerMenu() {
		
		return ("Index");
	}
}
