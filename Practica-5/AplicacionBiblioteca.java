
import java.util.Arrays;
import java.util.List;

public class AplicacionBiblioteca {
    public static void main(String[] args) {
        // creacion de objetos independientes
        // objeto Autor
        Autor autor1 = new Autor("Isabel Allende", "Chilena");
        // objeto Libro
        List<String> contenidoCasaEspiritus = Arrays.asList(
            "La casa de los espíritus es una novela que narra la historia...",
            "Clara del Valle, con sus poderes psíquicos, observa los eventos...",
            "La familia Trueba enfrenta diversas tragedias y cambios sociales..."
        );
        Libro libro1 = new Libro("La Casa de los Espíritus", "978-9562840684", contenidoCasaEspiritus);
        // objeto estudiante
        Estudiante est1 = new Estudiante("UMSA001", "Ana Perez");

        System.out.println("Objetos independientes creados.\n");
        autor1.mostrarInfo();
        libro1.leer();
        System.out.println("-----------------------------------------------------");
        est1.mostrarInfo();
        System.out.println("-----------------------------------------------------");

        // creacion de objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UMSA");
        biblioteca.agregarAutor(autor1);
        biblioteca.agregarLibro(libro1);
        System.out.println("----------------------------------------");
        // creacion de objeto Prestamo
        Prestamo prest1 = biblioteca.prestarLibro(est1, libro1);
        biblioteca.mostrarEstado();

        // cerrar biblioteca (destruir)
        biblioteca.cerrarBiblioteca();
        // estado despues de cerrar la biblioteca
        biblioteca.mostrarEstado();
        // prueba de existencia independiente de objetos
        System.out.println("\n--- Verificación de existencia de objetos independientes después de cerrar la biblioteca:");
        System.out.println("[Agregacion] Libro y Autor siguen existiendo:");
        libro1.leer();
        autor1.mostrarInfo();
        System.out.println("");
    }   
}    
