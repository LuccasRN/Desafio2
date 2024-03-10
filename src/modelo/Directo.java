package modelo;

public class Directo extends Empleado{

	protected double salarioFijo;

	public Directo(String nombre, double salarioFijo) {
		super(nombre);
		this.salarioFijo = salarioFijo;
	}
	
	private double calcularSalud() {
		return salarioFijo * 0.057;
	}
	
	private double calcularPension() {
		return salarioFijo * 0.065;
	}

	@Override
	public double calcularSalario() {
		return salarioFijo - calcularPension() - calcularSalud();
	}

	@Override
	public String toString() {
		return "Directo [salarioFijo=" + salarioFijo + ", nombre=" + nombre + ", calcularSalario()=" + calcularSalario()
				+ "]";
	}
	
	
}
