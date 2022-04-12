package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {
	
	@GetMapping("/menu")
	
	public String mostrarMenu() {
		
		return ("Index");
	}
	
	@GetMapping("/resolverSuma")
	
	public String getSumaPage(@RequestParam (name = "n1") int n1 , @RequestParam (name = "n2") int n2 , Model model) {
		
		Calculadora nuevaCalculadora = new Calculadora();
		
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		
		int resultadoS = 0;
		resultadoS = nuevaCalculadora.resolverSuma();
		
		model.addAttribute("resultadoS", resultadoS);
		
		return "resultado";
	}
}
