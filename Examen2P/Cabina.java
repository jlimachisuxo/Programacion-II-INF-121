import java.util.ArrayList;

public class Cabina {
    private int nroCabina;
    private ArrayList<Persona> personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new ArrayList<>();
    }

    public Cabina(int nroCabina, ArrayList<Persona> personasAbordo) {
        this.nroCabina = nroCabina;
        this.personasAbordo = personasAbordo;
    }

    public void agregarPersona(Persona p) {
        personasAbordo.add(p);
    }

    // getters
    public int getNroCabina() {
        return nroCabina;
    }
    public ArrayList<Persona> getPersonasAbordo() {
        return personasAbordo;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cabina Nro: ").append(nroCabina).append("\n");
        sb.append("Personas a bordo:\n");
        for (Persona p : personasAbordo) {
            sb.append(" - ").append(p.mostrar()).append("\n");
        }
        return sb.toString();
    }
}
