package ObjetosCiudad;

public class Rascacielos extends Edificio {

    private float profundidad;

    public Rascacielos() {
        this.altura = 100.0f;
        this.profundidad = 500.0f;
    }

    public Rascacielos(String ne, float a, String d, float p) {
        super(ne, a, d);
        this.profundidad = p;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    public String print() {
        String salida = super.print();
        salida = salida + "Profundidad: " + this.profundidad + "\n";

        return salida;
    }

    @Override
    public String funcionalidadEdificio() {
        return "Turismo";
    }

    @Override
    public String tipoEdificio() {
        if (this.altura > 100.f) {
            return "Este edificio es del tipo rascacielos";
        } else {
            return "Este edificio es una iglesia";
        }
    }
}

