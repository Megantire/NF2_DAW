package vehiculos;

public class Gasolina extends Vehiculos {

	private boolean contaminacion;
	private float tamanoDepositoExclusivas;
	
	public Gasolina() {
		super();
		this.contaminacion = true;
		this.tamanoDepositoExclusivas = 0.0f;
	}
	
	
	public Gasolina(String m, float pr, float pe, String co, float lon, boolean c, float t) {


	super(m, pr, pe, co, lon);
	this.contaminacion = c;
	this.tamanoDepositoExclusivas = t;

	
	}


	public boolean isContaminacion() {
		return contaminacion;
	}


	public void setContaminacion(boolean contaminacion) {
		this.contaminacion = contaminacion;
	}


	public float getTamanoDepositoExclusivas() {
		return tamanoDepositoExclusivas;
	}


	public void setTamanoDepositoExclusivas(float tamanoDepositoExclusivas) {
		this.tamanoDepositoExclusivas = tamanoDepositoExclusivas;
	}
	@Override
	public String mostrarInfo() {
		
		return super.mostrarInfo() + " - " + this.contaminacion + " - " + this.tamanoDepositoExclusivas;
	}
}

	
