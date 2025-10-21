package Empresa;

import productos.*;
import vehiculos.*;
import edificios.*;

public final class Empresa {
	
	private vehiculos.Electricos vehiculo1;
	private vehiculos.Gasoil vehiculo2;
	private edificios.Fabrica edificios1;
	private edificios.Oficina edificios2;
	private edificios.Almacen edificios3;
	private Productos producto1;
	private Productos producto2;
	private Productos producto3;
	private Productos producto4;
    
    // Null
    
    public Empresa() {
        this.vehiculo1 = null;
        this.vehiculo2 = null;
        this.edificios1 = null;
        this.edificios2 = null;
        this.edificios3 = null;
        this.producto1 = null;
        this.producto2 = null;
        this.producto3 = null;
        this.producto4 = null;
    }
	
    // Getters y setters
    
    public vehiculos.Electricos getVehiculo1() {
		return vehiculo1;
	}

	public void setVehiculo1(vehiculos.Electricos vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public vehiculos.Gasoil getVehiculo2() {
		return vehiculo2;
	}

	public void setVehiculo2(vehiculos.Gasoil vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}

	public edificios.Fabrica getEdificios1() {
		return edificios1;
	}

	public void setEdificio1(edificios.Fabrica edificios1) {
		this.edificios1 = edificios1;
	}

	public edificios.Oficina getEdificios2() {
		return edificios2;
	}

	public void setEdificios2(edificios.Oficina edificios2) {
		this.edificios2 = edificios2;
	}

	public edificios.Almacen getEdificios3() {
		return edificios3;
	}

	public void setEdificios3(edificios.Almacen edificios3) {
		this.edificios3 = edificios3;
	}

	public Productos getProducto1() {
		return producto1;
	}

	public void setProducto1(Productos producto1) {
		this.producto1 = producto1;
	}

	public Productos getProducto2() {
		return producto2;
	}

	public void setProducto2(Productos producto2) {
		this.producto2 = producto2;
	}

	public Productos getProducto3() {
		return producto3;
	}

	public void setProducto3(Productos producto3) {
		this.producto3 = producto3;
	}

	public Productos getProducto4() {
		return producto4;
	}

	public void setProducto4(Productos producto4) {
		this.producto4 = producto4;
	}

	public String mostrarInfo() {
		String info = "Información de la Empresa: \n";
		
		info = info + "Información del vehículo 1: " + vehiculo1 + "\n";
		info = info + "Información del vehículo 2: " + vehiculo2 + "\n";
		info = info + "Información de la fábrica: " + edificios1 + "\n";
		info = info + "Información de la oficina: " + edificios2 + "\n";
		info = info + "Información del almacén: " + edificios3 + "\n";
		info = info + "Información del producto 1: " + producto1 + "\n";
		info = info + "Información del producto 2: " + producto2 + "\n";
		info = info + "Información del producto 3: " + producto3 + "\n"; 
		info = info + "Información del producto 4: " + producto4 + "\n";
		
		
		return info;
	}
    
}
