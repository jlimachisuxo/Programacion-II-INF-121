import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

public class Consulta {
    private int ci;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int idMed;
    private int dia;
    private String mes;
    private int anio;

    // constructor
    public Consulta(int ci, String nombrePaciente, String apellidoPaciente, int idMed, int dia, String mes, int anio) {
        this.ci = ci;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Consulta() {
        this.ci = -1;
        this.nombrePaciente = "";
        this.apellidoPaciente = "";
        this.idMed = -1;
        this.dia = -1;
        this.mes = "";
        this.anio = -1;
    }

    // baja
     public void alta(){
        String ruta = "archivoConsultas/consulta"+ ci +".json";
        Gson gson = new Gson();
        
        try {
            FileWriter w = new FileWriter(ruta);
            gson.toJson(this, w);
            w.close();
            System.out.println("\t\t---ALTA DE CONSULTA CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN ALTA CONSULTA:\n\n"+e);
        }
    }

    //leer 
    public void cargar(String ruta){
        Gson gson = new Gson();
        try {
            FileReader r = new FileReader(ruta);
            Consulta c = gson.fromJson(r, Consulta.class);
            this.ci = c.ci;
            this.nombrePaciente = c.nombrePaciente;
            this.apellidoPaciente = c.apellidoPaciente;
            this.idMed = c.idMed;
            this.dia = c.dia;
            this.mes = c.mes;
            this.anio = c.anio;
            r.close();
            
            System.out.println("\t\t---CARGA DE CONSULTA CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN CARGA CONSULTA:\n\n"+e);
        }
    }

    // baja
    public void baja(){
        String ruta = "archivoConsultas/consulta"+ ci +".json";
        
        File archivo = new File(ruta);
        if(archivo.delete()){
            System.out.println("SE ELIMINO CORRECTAMENTE EL ARCHIVO "+archivo.getPath());
        }else{
            System.out.println("ERROR EN ELIMINACION DEL ARCHIVO "+archivo.getPath());
        }
    }

    // getters
    public int getCi() {
        return ci;
    }
    public String getNombrePaciente() {
        return nombrePaciente;
    }
    public String getApellidoPaciente() {
        return apellidoPaciente;
    }
    public int getIdMed() {
        return idMed;
    }
    public int getDia() {
        return dia;
    }
    public String getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

    // setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "ci=" + ci +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", apellidoPaciente='" + apellidoPaciente + '\'' +
                ", idMed=" + idMed +
                ", dia=" + dia +
                ", mes='" + mes + '\'' +
                ", anio=" + anio +
                '}';
    }
}
