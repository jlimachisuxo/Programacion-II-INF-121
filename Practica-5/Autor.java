public class Autor {
    private String nombre;
    private String nacionalidad;
    // constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del autor: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
    public String getNombre() {
        return nombre;
    }
}
