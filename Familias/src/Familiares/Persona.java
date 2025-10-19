package Familiares;

public class Persona extends Familia
	{

	    // Atributos

	    private String nombre;
	    private int edad;
	    private String dni;
	    private String sexo;
	    private float peso;
	    private float altura;

	    // Constructores

	    public Persona()
	    {
	    	super();
	    	
	        this.nombre = "";
	        this.edad = 0;
	        this.dni = "";
	        this.sexo = "";
	        this.peso = 0.0f;
	        this.altura = 0.0f;
	    }

	    public Persona(String n, int e, String d, String s, float p, float a, int numLibroFam, String direccion, String poblacion, String provincia){
	       
	    	super(numLibroFam, direccion, poblacion, provincia);
	    	this.nombre = n;
	        this.edad = e;
	        this.dni = d;
	        this.sexo = s;
	        this.peso = p;
	        this.altura = a;
	        
	    }

	    // Getters y setters

	    public String getNombre()
	    {
	        return nombre;
	    }
	    public void setNombre(String nombre)
	    {
	        this.nombre = nombre;
	    }

	    public int getEdad()
	    {
	        return edad;
	    }
	    public void setEdad(int edad)
	    {
	        this.edad = edad;
	    }

	    public String getdni()
	        {
	        return dni;
	        }
	    public void  setdni(String dni)
	    {
	        this.dni = dni;
	    }

	    public String getSexo()
	    {
	        return sexo;
	    }
	    public void setSexo(String sexo)
	    {
	        this.sexo = sexo;
	    }

	    public float getPeso()
	    {
	        return peso;
	    }
	    public void getPeso(float peso)
	    {
	        this.peso = peso;
	    }

	    public float getAltura()
	    {
	        return altura;
	    }
	    public void setAltura(float altura)
	    {
	        this.altura = altura;
	    }
	


// IMC

public float imc() {
	return peso / (altura*altura);
}

// Método print

public String print()
{
	String salida = "****************\n";
	salida = salida + "Nombre: " + this.nombre+"\n";
	salida = salida + "Edad: " + this.edad + "\n"; 
	salida = salida + "DNI: " + this.dni + "\n";
	salida = salida + "Sexo: " + this.sexo + "\n";
	salida = salida + "Peso: " + this.peso + "\n";
	salida = salida + "Altura: " + this.altura + "\n";
	salida = salida + "Número de libro de familia: " + this.numerodelibrodeFamilia + "\n";
	salida = salida + "Dirección: " + this.direccion + "\n";
	salida = salida + "Población: " + this.poblacion + "\n";
	salida = salida + "Provincia: " + this.provincia + "\n";
	salida = salida + "IMC: " + imc()+"\n"; 
	
	return salida;
}
}

