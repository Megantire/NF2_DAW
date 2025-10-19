package edificios;

public class Almacen extends Edificio {

	public Almacen() {
		super();
		this.tipo = "Almacén";
		this.altura = 400.0f;
		this.anchura = 600.0f;
		this.profundidad = 700.0f;
	}
	
	public Almacen(float an, float al, float pr, String fu, String ti) {
		super(an, al, pr, "", "");
	}
	
	@Override public String funcionalidadEdificio() {
		return "Lugar donde se almacenen los productos";
	}
	
	public float costePintura() {
		return (30 * anchura * altura * profundidad);
	}
	
	@Override
	public String mostrarInfo(){
		return super.mostrarInfo() + " - " + this.funcionalidadEdificio() + " - " + this.tipo ;	
		}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
	
}
