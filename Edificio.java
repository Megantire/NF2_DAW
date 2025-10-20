package edificios;

public abstract class Edificio {

	protected float anchura = 0.0f;
	protected float altura = 0.0f;
	protected float profundidad = 0.0f;
	protected String funcionalidad = "";
	protected String tipo = "";

	
	// Constructor
	
	public Edificio() {
		this.anchura = 0.0f;
		this.altura = 0.0f;
		this.profundidad = 0.0f;
		this.funcionalidad = "";
		this.tipo = "";
	}
	
	public Edificio(float an, float al, float pr, String fu, String ti) {
		this.anchura = an;
		this.altura = al;
		this.profundidad = pr;
		this.funcionalidad = fu;
		this.tipo = ti;
	}

	// Getters y setters
	
	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public String getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Coste Pintura
	
	protected abstract float costePintura();
	
	// Abstracto
	
	public abstract String funcionalidadEdificio();
	
	// MostrarInfo
	
	protected String mostrarInfo() 
	
	{
				return this.anchura + " - " + this.altura + " - " + this.profundidad + " - " + costePintura();
		
		}
	
	}


