package vehiculos;

public class Gasoil extends Vehiculos {

	public Gasoil() {
		super();
	}
	
	public Gasoil(String m, float pr, float pe, String co, float lon) {
		super(m, pr, pe, co, lon);
	}
	
	@Override
	public String mostrarInfo(){
		return super.mostrarInfo();
	}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
		
	}


