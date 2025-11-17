public class Persona {
    private String nombre;
    private int edad;
    private float pesoPersona;

    public Persona(String nombre, int edad, float pesoPersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = pesoPersona;
    }

    // getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getPesoPersona() {
        return pesoPersona;
    }

    //--------------
    public String mostrar() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + pesoPersona + " kg";
    }
}
