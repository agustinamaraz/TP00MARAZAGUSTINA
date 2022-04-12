package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00MarazAgustinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00MarazAgustinaApplication.class, args);
		
		String nombre = "Agustina";
				
		System.out.println("HOLA MUNDO, dice "+ nombre + " " + darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44949820");
		unEstudiante.setNombre("Daiana");
		unEstudiante.setApellido("Maraz");
		
		System.out.println("El estudiante "+ unEstudiante.getNombre() +" "+ unEstudiante.getApellido() + " dice HOLA!");
			
		Calculadora unCalculadora = new Calculadora(); //metodo constructor
		
		unCalculadora.setN1(8);
		unCalculadora.setN2(3);
		
		System.out.println("El resultado de la suma es " + unCalculadora.resolverSuma());
		
		System.out.println("El resultado de la resta es " + unCalculadora.resolverResta());
		
		System.out.println("El resultado de la division es " + unCalculadora.resolverDivision());
		
		System.out.println("El resultado de la multiplicacion es " + unCalculadora.resolverMultiplicacion());
		
		System.out.println("El resultado de la potencia es " + unCalculadora.resolverPotencia());
		
		System.out.println("El resultado de la raiz " + unCalculadora.resolverRaiz());
		

	}
	
	public static String darNombre() {
		String nuevoNombre = "Maraz";
		return nuevoNombre;
		
	}
	

}