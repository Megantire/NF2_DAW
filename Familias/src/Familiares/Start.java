package Familiares;

import Familiares.Persona;

public class Start {
 
	public static void main (String[] args) {
		// TODO Auto-generated method stub

		        // Creación de personas

		Persona padre = new Persona("Pedro", 34, "3636535K", "Hombre", 80.0f, 1.80f, 12321, "Calle Figueroa 123 1 1", "Barcelona", "Barcelona");
		Persona madre = new Persona("Valentina", 35, "388892J", "Mujer", 70.0f, 1.40f, 12321, "Calle Figueroa 123 1 1", "Barcelona", "Barcelona");
		Persona hijo = new Persona("Sebastián", 13, "1234569K", "Niño", 89.5f, 1.70f,12321, "Calle Figueroa 123 1 1", "Barcelona", "Barcelona");
	
	
	System.out.println("Datos del padre: \n" + padre.print());
	System.out.println("Datos de la madre: \n" + madre.print());
	System.out.println("Datos del hijo: \n" + hijo.print());

	}
	
}
	

