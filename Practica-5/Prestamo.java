import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;
    // constructor
    public Prestamo(Estudiante estudiante, Libro libro){
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = this.fechaPrestamo.plusDays(7);
        System.out.println("Préstamo creado para: " + estudiante.getNombre() + " Libro: " + libro.getTitulo());
        System.out.println("");
    }
    // metodo
    public void mostrarInfo(){
        System.out.println("    Dellaes del préstamo:");
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
    }
}
