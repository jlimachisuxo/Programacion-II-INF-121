public class Estudiante {
    private String codigoEstudiante;
    private String nombre;
    // constructor
    public Estudiante(String codigoEstudiante, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("Código del estudiante: " + codigoEstudiante + ", Nombre: " + nombre);
    }
    public String getNombre() {
        return nombre;
    }
}
