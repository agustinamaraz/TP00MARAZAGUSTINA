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

	public String getSumaPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		int resultadoS = 0;
		resultadoS = nuevaCalculadora.resolverSuma();

		model.addAttribute("resultadoS", resultadoS);

		return "resultadoSuma";
	}

	@GetMapping("/resolverResta")

	public String getRestaPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		int resultadoR = 0;
		resultadoR = nuevaCalculadora.resolverResta();

		model.addAttribute("resultadoR", resultadoR);

		return "resultadoResta";
	}
	
	@GetMapping("/resolverMultiplicacion")

	public String getMultiplicacionPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		int resultadoM = 0;
		resultadoM = nuevaCalculadora.resolverMultiplicacion();

		model.addAttribute("resultadoM", resultadoM);

		return "resultadoMultiplicacion";
	}
	
	@GetMapping("/resolverDivision")

	public String getDivisionPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		float resultadoD = 0;
		
		if(n2!=0) {
			resultadoD = nuevaCalculadora.resolverDivision();
			model.addAttribute("resultadoD", resultadoD);
			return "resultadoDivision";
		}else {
			return "resultadoDivisionIncorrecta";
			
		}
		

		
	}
	
	@GetMapping("/resolverPotencia")

	public String getPotenciaPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		int resultadoP = 0;
		resultadoP = nuevaCalculadora.resolverPotencia();

		model.addAttribute("resultadoP", resultadoP);

		return "resultadoPotencia";
	}
	
	@GetMapping("/resolverRaiz")

	public String getRaizPage(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {

		Calculadora nuevaCalculadora = new Calculadora();

		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);

		double resultadoRA = 0;
		
		if(n2!=0) {
			resultadoRA = nuevaCalculadora.resolverRaiz();

			model.addAttribute("resultadoRA", resultadoRA);
			
			return "resultadoRaiz";
		}else {
			return "resultadoRaizIncorrecta";
		}
		

		
	}
}
