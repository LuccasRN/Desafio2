package modelo;

public class Promotores extends Empleado{

	private int cantidadAfiches;
	private double valorVolante;
	private int compraVolante;
	
	public Promotores(String nombre, int cantidadAfiches, double valorVolante, int compraVolante) {
		super(nombre);
		this.cantidadAfiches = cantidadAfiches;
		this.valorVolante = valorVolante;
		this.compraVolante = compraVolante;
	}

	@Override
	public double calcularSalario() {
		
		return cantidadAfiches * valorVolante + (compraVolante * 12900);
	}

	@Override
	public String toString() {
		return "Promotores [cantidadAfiches=" + cantidadAfiches + ", valorVolante=" + valorVolante + ", compraVolante="
				+ compraVolante + ", nombre=" + nombre + ", calcularSalario()=" + calcularSalario() + "]";
	}
	
	
	
	
}
