// Ciudad Programación Orientada a Objetos
import ObjetosCiudad.Coche;
import ObjetosCiudad.Edificio;
import ObjetosCiudad.Iglesia;
import ObjetosCiudad.Rascacielos;

public class Main{

    public static void main (String [] args){

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche("Opel",2.0f, "Yellow", 5, true);
        Coche coche4 = new Coche("Opel");
        Coche coche5 = new Coche("Ferrari", 2.5f, "White",3, false );

        Rascacielos ras1 = new Rascacielos();
        Rascacielos ras2 = new Rascacielos("Inventado",200.0f,"Julián",400.0f);

        Iglesia igle1 = new Iglesia();

        System.out.println(ras1.funcionalidadEdificio());
        System.out.println(igle1.funcionalidadEdificio());

        System.out.println(ras1.tipoEdificio());
        System.out.println(igle1.tipoEdificio());


        // Coche1
        System.out.println("Info coche1: \n" + coche1.print());

        /*
        System.out.println("La marca del coche 1 es " + coche1.getMarca());

        coche1.setMarca("Tesla");
        System.out.println("La marca del coche 1 después del cambio es " + coche1.getMarca());

        System.out.println("El color del coche 1 es : " + coche1.getColor());

        System.out.println("El coche 1 está arrancado: " + coche1.getEstaArrancado());
        */


        // Coche 2
        System.out.println("Info coche2: \n" + coche2.print());
        /*
        System.out.println("La marca del coche 2 es: " + coche2.getMarca());

        System.out.println("El color del coche 2 es : " + coche2.getColor());

        System.out.println("El coche 2 está arrancado: " + coche2.getEstaArrancado());
        */




        // Coche 4
        System.out.println("La marca del coche 4 es: " + coche4.getMarca());

        // Coche 5
        System.out.println("La marca del coche 5 es: " + coche5.getMarca());
        System.out.println("El color del coche 5 es : " + coche5.getColor());

        // Edificio 1

       // System.out.println("Info edificio 1: \n" + edi1.print());
        // System.out.println("Info edificio 1: \n" + edi1.print(" INFO EDIFICIO 1"));
        // System.out.println("La altura del edificio 1 es: " + edi1.getAltura());

        // Edificio 2

       // System.out.println("Info edificio 2: \n" + edi2.print());

        // System.out.println("El nombre del edificio 2 es: " + edi2.getNombreEdificio());


        // Rascacielos 1

        System.out.println("Info rascacielos 1: \n" + ras1.print());
        System.out.println("Info rascacielos 2: \n" + ras2.print());


        // ras1.setProfundidad(200); Con este cambio se actualiza la profundidad a 200

        System.out.println("La profundidad del rascacielos 1 es:\n " + ras1.getProfundidad());


    }
}