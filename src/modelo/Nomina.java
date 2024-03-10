package modelo;
import java.util.ArrayList;


public class Nomina {

	private ArrayList<Empleado> listaEmpleados;
	
	public Nomina() {
		this.listaEmpleados = new ArrayList<>();
	}
	
	public void adicionarEmpleado(Empleado empleado) {
		
		listaEmpleados.add(empleado);
	}
	
	public void calcularNomina() {
		double nominaTotal = 0;
		for (int i = 0; i < listaEmpleados.size(); i++) {
			nominaTotal += listaEmpleados.get(i).calcularSalario();
		}
		
		System.out.println("Nomina Total: " + nominaTotal);
	}
	
	public void listarDirectos() {
		System.out.println("Lista empleados Directos:");
		
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Directo) {
				System.out.println("-"+listaEmpleados.get(i));
			}
		}
	}
	
	public void listarPromotor() {
		System.out.println("Lista empleados Promotores:");
		
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Promotores) {
				System.out.println("-"+listaEmpleados.get(i));
			}
		}
	}
	
	public void listarFreelancers() {
		System.out.println("Lista empleados freelancers:");
		
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Freelance) {
				System.out.println("-"+listaEmpleados.get(i));
			}
		}
	}
	
	public void listarVendedor() {
		System.out.println("Lista de Vendedores:");
		
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Vendedor) {
				System.out.println("-"+listaEmpleados.get(i));
			}
		}
	}
}
