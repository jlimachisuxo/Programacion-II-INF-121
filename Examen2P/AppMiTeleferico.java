import java.util.ArrayList;

public class AppMiTeleferico {
    public static void main(String[] args) {
        MiTeleferico miTelef = new MiTeleferico();

        // personaas
        Persona p1 = new Persona("Ana", 30, 65f);
        Persona p2 = new Persona("Luis", 25, 75f);
        Persona p3 = new Persona("Marta", 22, 55f);
        Persona p4 = new Persona("Carlos", 61, 80f);
        Persona p5 = new Persona("Sofia", 40, 60f);

        // cabinas
        Cabina cabina1 = new Cabina(1);
        Cabina cabina2 = new Cabina(2);
        Cabina cabina3 = new Cabina(3);
        cabina1.agregarPersona(p1);
        cabina1.agregarPersona(p2);
        // agregar lineas
        Linea lineaRoja = new Linea("Roja");
        Linea lineaAmarillo = new Linea("Amarillo");
        Linea lineaVerde = new Linea("Verde");
        
        miTelef.agregarCabina("Roja");
        miTelef.agregarCabina("Amarillo");
        miTelef.agregarCabina("Verde");
        System.out.println(miTelef.mostrar());
    }
}
