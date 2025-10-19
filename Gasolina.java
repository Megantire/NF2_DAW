package vehículos;

public class Gasolina extends Vehículos {

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


	public boolean isContaminación() {
		return contaminacion;
	}


	public void setContaminacion(boolean contaminación) {
		this.contaminacion = contaminación;
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

	
