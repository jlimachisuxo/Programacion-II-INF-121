import java.util.ArrayList;

public class Linea {
    private String color;
    private ArrayList<Persona> filaPersonas;
    private ArrayList<Cabina> cabinas;
    private int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.cantidadCabinas = 0;
    }

    public void agregarPersona(Persona p){
        filaPersonas.add(p);
    }

    public void agregarCabina(Cabina c){
        cabinas.add(c);
        cantidadCabinas++;
    }

    // getters
    public String getColor() {
        return color;
    }
    public ArrayList<Persona> getFilaPersonas() {
        return filaPersonas;
    }
    public int getCantidadCabinas() {
        return cantidadCabinas;
    }
    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linea Color: ").append(color).append("\n");
        sb.append("Cantidad de Cabinas: ").append(cantidadCabinas).append("\n");
        sb.append("Fila de Personas:\n");
        for (Persona p : filaPersonas) {
            sb.append(" - ").append(p.mostrar()).append("\n");
        }
        sb.append("Cabinas:\n");
        for (Cabina c : cabinas) {
            sb.append(c.mostrar()).append("\n");
        }
        return sb.toString();
    }
}
