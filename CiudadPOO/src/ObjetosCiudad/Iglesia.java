package ObjetosCiudad;

public class Iglesia extends Edificio {
    @Override
    public String funcionalidadEdificio() {
        return "Religión";
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


