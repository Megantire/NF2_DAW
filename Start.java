// Import
import vehículos.*;
import edificios.*;
import productos.*;
import Empresa.*;


// Public class

public class Start {

	public static void main (String [] args) {
		
	
		// Instanciamos empresa 
		
		Empresa empresa = new Empresa ();
		
		
		// Instanciamos 2 coches
		
		Eléctricos coche1 = new Eléctricos("Seat Altea", 20000f,3000, "Rojo", 3.0f, 4000f);
		
		Gasoil coche2 = new Gasoil("Renault Kadjar", 28000f,4000f,"Azul",3.5f);
		

		// Instanciamos 3 edificios, 1 de cada tipo
	
		Fabrica edi1 = new Fabrica();
		Oficina edi2 = new Oficina();
		Almacen edi3 = new Almacen();
	
		
		// Instanciamos los 4 productos
		
		Sillas si1 = new Sillas (1, "Silla N20", "Silla", 1, 0.5f, 0.5f); // Orden: identificador, nombre, tipo, anchura, profundidad, altura
		Sillas si2 = new Sillas (2, "Silla M100", "Silla", 1.5f, 1.5f, 0.5f); 
		Puertas pu1 = new Puertas (3, "Puerta P9", "Puerta", 1.5f, 0.25f, 2.25f); 
		Puertas pu2 = new Puertas (4, "Puertas F50", "Puerta", 1.25f, 0.25f, 1.25f);
				
		
		empresa.setVehiculo1(coche1);
		empresa.setVehiculo2(coche2);
		empresa.setEdificio1(edi1);
		empresa.setEdificios2(edi2);
		empresa.setEdificios3(edi3);
		empresa.setProducto1(si1);
		empresa.setProducto2(si2);
		empresa.setProducto3(pu1);
		empresa.setProducto4(pu2);
		
		System.out.println(empresa.mostrarInfo());
		
		
		
	
		
		
	}
	
	
}
