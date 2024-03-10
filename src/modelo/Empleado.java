package modelo;

public abstract class Empleado {

	protected String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract double calcularSalario();
	
	
}
