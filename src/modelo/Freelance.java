package modelo;

public class Freelance extends Empleado{

	private int numeroHoras;
	private double valorHora;
	
	

	public Freelance(String nombre, int numeroHoras, double valorHora) {
		super(nombre);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}



	@Override
	public double calcularSalario() {
		
		return numeroHoras * valorHora;
	}



	@Override
	public String toString() {
		return "Freelance [numeroHoras=" + numeroHoras + ", valorHora=" + valorHora + ", nombre=" + nombre
				+ ", calcularSalario()=" + calcularSalario() + "]";
	}



	



	
	
	
	
	
	

}
