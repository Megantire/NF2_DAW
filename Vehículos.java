package vehículos;

public abstract class Vehículos {
	
	protected String marca;
	protected float precio;
	protected float peso; 
	protected String color;
	protected float longitud;
	
	// Constructor
	
	public Vehículos() {
		this.marca = "";
		this.precio = 0.0f;
		this.peso = 0.0f;
		this.color = "";
		this.longitud = 0.0f;
	}
	
	public Vehículos(String m, float pr, float pe, String co, float lon) {
		this.marca = m;
		this.precio = pr;
		this.peso = pe;
		this.color = co;
		this.longitud = lon;
	}

	
	// Getters y setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	// Métodos
	
	protected String mostrarInfo() 
	
	{
		
			return this.marca + " - " + this.precio + " - " + this.peso + " - " + this.color + " - " + this.longitud;
		
		}
	}
	

