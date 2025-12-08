import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

public class Medico {

    private int idMed;
    private String nombreMed;
    private String apellidoMed;
    private int aniosExperiencia;

    //constructor
    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Medico() {
        this.idMed = -1;
        this.nombreMed = "";
        this.apellidoMed = "";
        this.aniosExperiencia = -1;
    }

    //alta
     public void alta(){
        String ruta = "archivoMedicos/medico"+ idMed +".json";
        Gson gson = new Gson();
        
        try {
            FileWriter w = new FileWriter(ruta);
            gson.toJson(this, w);
            w.close();
            System.out.println("\t\t---ALTA DE MEDICO CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN ALTA MEDICO:\n\n"+e);
        }
    }

        //leer 
    public void cargar(String ruta){
        Gson gson = new Gson();
        try {
            FileReader r = new FileReader(ruta);
            Medico m = gson.fromJson(r, Medico.class);
            this.idMed = m.idMed;
            this.nombreMed = m.nombreMed;
            this.apellidoMed = m.apellidoMed;
            this.aniosExperiencia = m.aniosExperiencia;
            r.close();
            
            System.out.println("\t\t---CARGA DE MEDICO CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN CARGA MEDICO:\n\n"+e);
        }
    }

    // baja
    public void baja(){
        String ruta = "archivoMedicos/medico"+ idMed +".json";
        
        File archivo = new File(ruta);
        if(archivo.delete()){
            System.out.println("SE ELIMINO CORRECTAMENTE EL ARCHIVO "+archivo.getPath());
        }else{
            System.out.println("ERROR EN ELIMINACION DEL ARCHIVO "+archivo.getPath());
        }
    }

    // getters
    public int getIdMed() {
        return idMed;
    }
    public String getNombreMed() {
        return nombreMed;
    }
    public String getApellidoMed() {
        return apellidoMed;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    @Override
    public String toString() {
        return "Medico [idMed=" + idMed + ", nombreMed=" + nombreMed + ", apellidoMed=" + apellidoMed
                + ", aniosExperiencia=" + aniosExperiencia + "]";
    }

}