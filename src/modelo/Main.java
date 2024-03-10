package modelo;

public class Main {

	public static void main(String[] args) {
		
		Nomina nomina = new Nomina();
		
		Empleado juan = new Directo("Juan",4840000);
		Empleado julian = new Vendedor("Julian",2050000,45510000);
		Empleado claudia = new Vendedor("Claudia",1380000,35989000);
		Empleado johanna = new Freelance("Johanna",89,71000);
		Empleado david = new Directo("David",3975000);
		Empleado gustavo = new Freelance("Gustavo",65,42500);
		Empleado pedro = new Promotores("Pedro",2000,200,77);
		
		nomina.adicionarEmpleado(juan);
		nomina.adicionarEmpleado(julian);
		nomina.adicionarEmpleado(claudia);
		nomina.adicionarEmpleado(johanna);
		nomina.adicionarEmpleado(david);
		nomina.adicionarEmpleado(gustavo);
		nomina.adicionarEmpleado(pedro);

		nomina.calcularNomina();
		
		nomina.listarDirectos();
		nomina.listarFreelancers();
		nomina.listarPromotor();
		nomina.listarVendedor();
		
	}

}
