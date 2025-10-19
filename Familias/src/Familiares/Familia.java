package Familiares;


	public abstract class Familia
	
	{
		
	protected int numerodelibrodeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	
	

	public Familia()
	
	{
	    this.numerodelibrodeFamilia = 0;
	    this.direccion = "";
	    this.poblacion = "";
	    this.provincia = "";

	}
	
	public Familia(int numLibroFam, String direccion, String poblacion, String provincia) {
		
		this.numerodelibrodeFamilia = numLibroFam;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.provincia = provincia;
		
	}

	public int getNumerodelibrodeFamilia() {
		return numerodelibrodeFamilia;
	}

	public void setNumerodelibrodeFamilia(int numerodelibrodeFamilia) {
		this.numerodelibrodeFamilia = numerodelibrodeFamilia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
