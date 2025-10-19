package productos;

public class Productos {

	protected int identificador = 0;
	protected String nombre = "";
	protected String tipo = "";
	protected float anchura = 0.0f;
	protected float profundidad = 0.0f;
	protected float altura = 0.0f;
	
	// Constructor
	
	public Productos() {
		this.identificador = 0;
		this.nombre = "";
		this.tipo = "";
		this.anchura = 0.0f;
		this.profundidad = 0.0f;
		this.altura = 0.0f;
		
	}
	public Productos (int id, String n, String tipo, float anc, float prof, float alt) {
		this.identificador = id;
		this.nombre = n;
		this.tipo = tipo;
		this.anchura = anc;
		this.profundidad = prof;
		this.altura = alt;
	}
	
	// Getters y setters
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAnchura() {
		return anchura;
	}
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Métodos
	
	protected String mostrarInfo() {
		return this.identificador + " - " + this.nombre + " - " + this.anchura + " - " + this.profundidad + " - " + this.altura;
	}
	
}

