package ar.edu.unju.edm.model;

public class Calculadora {
	private int n1; 
	private int n2;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
		
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int resolverSuma() {
		int resultado = n1+n2;
		return resultado;
	}
	
	public int resolverResta() {
		int resultado =n1-n2;
		return resultado;
	}
	
	public float resolverDivision() {
		float resultado=0;
		
		if (n2!=0) {
			resultado=n1/n2;
		}else {
			System.out.println("No se puede divivir por 0");
		}
		
		return resultado;
	}
	
	public int resolverMultiplicacion() {
		int resultado =n1*n2;
		return resultado;
	}
	
}
