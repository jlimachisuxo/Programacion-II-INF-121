public class Pagina {
    private int numeroPagina;
    private String contenido;
    // constructor
    public Pagina(int numeroPagina, String contenido) {
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }

    public void mostrarContenido() {
        System.out.println("Página " + numeroPagina + ": " + contenido);
    }
}
