package vehículos;

public class Eléctricos extends Vehículos {

	private float potencia;
	
	public Eléctricos() {
		super();
		this.potencia = 0.0f;
	}
	
	
	public Eléctricos(String m, float pr, float pe, String co, float lon, float pt) {


	super(m, pr, pe, co, lon);
	this.potencia = pt;

	
	}


	public float getPotencia() {
		return potencia;
	}


	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String mostrarInfo() {
		
		return super.mostrarInfo() + " - " + this.potencia;
			
	}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
}
