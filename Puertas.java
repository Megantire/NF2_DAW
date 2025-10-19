package productos;

public class Puertas extends Productos{

	public Puertas() {
		super();
		
	}
	public Puertas(int id, String n, String tipo, float anc, float prof, float alt) {
		super(id, n, tipo, anc, prof, alt);
	}
	
	@Override
	public String mostrarInfo() {
		return super.mostrarInfo() + " - " + this.tipo;
	}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
	
}
