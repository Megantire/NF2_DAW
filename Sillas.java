package productos;

public class Sillas extends Productos {

	public Sillas() {
		super();
		
	}
	public Sillas(int id, String n, String tipo, float anc, float prof, float alt) {
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
