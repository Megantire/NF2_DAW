package ObjetosCiudad;

public class Coche {

    // Atributos -> Variables

    String marca;
    float longitud;
    String color;
    int numeroPuertas;
    boolean estaArrancado;


    // Constructor -> función

    public Coche()
    {
        this.marca = "Renault";
        this.longitud = 2.0f;
        this.color = "White";
        this.numeroPuertas = 3;
        this.estaArrancado = false;
    }

    public Coche(String marca)
    {
        this.marca = "Renault";
        this.longitud = 2.0f;
        this.color = "White";
        this.numeroPuertas = 3;
        this.estaArrancado = false;
    }

    public Coche(String m, float l, String c, int n, boolean e)
    {
        this.marca = m;
        this.longitud = l;
        this.color = c;
        this.numeroPuertas = n;
        this.estaArrancado = e;
    }

    // Getters y setters -> funciones

        public String getMarca()
        {
        return this.marca;
        }
        public void setMarca(String m)
        {
            this.marca = m;
        }

        public float getLongitud()
        {
            return this.longitud;
        }
        public void setLongitud(float l)
        {
            this.longitud = l;
        }

        public String getColor()
        {
        return this.color;
        }
        public void setColor(String c){
             this.color = c;
        }
        public int getNumeroPuertas(){
            return this.numeroPuertas;
        }
        public void setNumeroPuertas(int n){
        this.numeroPuertas = n;
        }
        public boolean getEstaArrancado(){
            return this.estaArrancado;
        }
        public void setEstaArrancado(boolean e){
        this.estaArrancado = e;
        }

    // Métodos propios -> funciones

    public float calculoInterno() // Ejemplo
    {
        return this.longitud * this.numeroPuertas;
    }

    public String info(){
        return this.marca + " . " + this.longitud + " . " + this.color;
    }


    public String print()
    {
        String salida ="**************************\n";
        salida = salida + "Marca: " + this.marca + "\n";
        salida = salida + "Longitud: " + this.longitud  + "\n";
        salida = salida + "Color: " + this.color + "\n";
        salida = salida + "Número de puertas: " + this.numeroPuertas + "\n";
        salida = salida + "Está arrancado: " + this.estaArrancado + "\n";
        return salida;
    }
}
