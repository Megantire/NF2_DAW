package edificios;

public class Fabrica extends Edificio {

	public Fabrica() {
		super();
		this.tipo = "Fábrica";
		this.altura = 400.0f;
		this.anchura = 400.0f;
		this.profundidad = 500.0f;
	}
	
	public Fabrica(float an, float al, float pr, String fu, String ti) {
		super(an, al, pr, "Lugar donde se crean los productos", "Fábrica");
	}
	
	@Override 
	public String funcionalidadEdificio() {
		return "Se crea el producto";
	}
	
	@Override
	public float costePintura() {
		return (30 * anchura * altura * profundidad);
	}
	
	@Override
	public String mostrarInfo(){
		return super.mostrarInfo() + " - " + this.funcionalidadEdificio() + " - " + this.tipo;	
		}
	@Override
	public String toString() {
	    return mostrarInfo();
	}
	
	
}
