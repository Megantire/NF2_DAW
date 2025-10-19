package edificios;

public class Oficina extends Edificio {

	public Oficina() {
		super();
		this.tipo = "Oficina";
		this.altura = 400.0f;
		this.anchura = 600.0f;
		this.profundidad = 700.0f;
	}
	
	public Oficina(float an, float al, float pr, String fu, String ti) {
		super(an, al, pr, fu, ti);
	}
	
	public float costePintura() {
		return (30 * anchura * altura * profundidad);
	}
	
	
	@Override public String funcionalidadEdificio() {
		return "Lugar donde se gestionan los productos";
	}
	@Override
	public String mostrarInfo(){
		return super.mostrarInfo() + " - " + this.funcionalidadEdificio() + " - " +  this.tipo;
	}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
}
