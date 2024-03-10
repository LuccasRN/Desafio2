package modelo;

public class Vendedor extends Directo{
	
	private double VentasMes;

	public Vendedor(String nombre, double salarioFijo, double ventasMes) {
		super(nombre, salarioFijo);
		VentasMes = ventasMes;
	}
	
	@Override
	public double calcularSalario() {
		double salario;
		if ( salarioFijo < 1500000) {
			salario = super.calcularSalario() + (VentasMes*0.045);
		}
		else {
			salario = super.calcularSalario() + (VentasMes*0.035);
		}
		
		return salario;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	
}
