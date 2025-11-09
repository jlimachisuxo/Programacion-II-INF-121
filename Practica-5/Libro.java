import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String ISBN;
    private List<Pagina> paginas;
    // constructor
    public Libro(String titulo, String ISBN, List<String> contenidoPaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = new ArrayList<>();
        // composicion libro crea sus paginas
        for(int i=0; i<contenidoPaginas.size(); i++){
            this.paginas.add(new Pagina(i + 1, contenidoPaginas.get(i)));
        } 
    }
    // metodo
    public void leer(){
        System.out.println("Leyendo el libro: " + titulo);
        for(Pagina pagina : paginas){
            pagina.mostrarContenido();
        }
        System.out.println("---Fin del libro---");
    }

    public String getTitulo(){
        return titulo;
    }
}
