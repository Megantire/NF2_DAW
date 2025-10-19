package ObjetosCiudad;

public abstract class Edificio implements IEdificio {

    // Atributos

    protected String nombreEdificio;
    protected float altura;
    protected String nombreDueno;

    // Constructor

    public Edificio(){
        this.nombreEdificio = "Corcega";
        this.altura = 10.0f;
        this.nombreDueno = "Paco García";
    }
    public Edificio(String ne, float a, String d)
    {
        this.altura = a;
        this.nombreEdificio = ne;
        this.nombreDueno = d;
    }
    public String getNombreEdificio() {
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String print()
    {
        String salida = "**************************\n";
        salida = salida + "Nombre edificio: "+ this.nombreEdificio+"\n";
        salida = salida + "Altura: "+ this.altura+"\n";
        salida = salida + "Nombre del dueño: " + this.nombreDueno+"\n";

        return salida;
    }
    public String print(String info)
    {
        String salida = "***********" + info + "***************\n";
        salida = salida + "Nombre edificio: "+ this.nombreEdificio+"\n";
        salida = salida + "Altura: "+ this.altura+"\n";
        salida = salida + "Nombre del dueño: " + this.nombreDueno+"\n";

        return salida;
    }
    public String print(int numero)
    {
        String salida = "**************************\n";
        salida = salida + "Nombre edificio: "+ this.nombreEdificio+"\n";
        salida = salida + "Altura: "+ this.altura+"\n";
        salida = salida + "Nombre del dueño: " + this.nombreDueno+"\n";

        return salida;
    }
    public abstract String funcionalidadEdificio();

}
