import java.io.File;
import java.util.ArrayList;

public class Consultorio {
    private String medicos;
    private String consultas;

    //constructor
    public Consultorio(String medicos, String consultas) {
        this.medicos = medicos;
        this.consultas = consultas;
    }

    
    public void mostrarConsultas(){
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        
        File carpeta = new File(this.consultas);
        File[] archivos = carpeta.listFiles();
        // cargando datos
        for(File f: archivos){
            Consulta nuevo = new Consulta();
            nuevo.cargar(f.getPath());
            lista.add(nuevo);
        }
        
        for(Consulta c: lista){
            System.out.println(c);
        }
        
    }
    
    public void mostrarMedicos(){
        ArrayList<Medico> lista = this.cargarMedicos();
        
        for(Medico m: lista){
            System.out.println(m);
        }
    }
    
    public ArrayList<Medico> cargarMedicos(){
        ArrayList<Medico> lista = new ArrayList<Medico>();
        
        File carpeta = new File(this.medicos);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            // cargando 
            Medico nuevo = new Medico();
            nuevo.cargar(f.getPath());
            lista.add(nuevo);
        }
        return lista;
    }
    
    public ArrayList<Consulta> cargarConsultas(){
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        
        File carpeta = new File(this.consultas);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Consulta nuevo = new Consulta();
            nuevo.cargar(f.getPath());
            lista.add(nuevo);
        }
        return  lista;
    }
    
    // baja de medicos nomx apy y sus consultas
    
    public void bajaMedNomXApY(String nombreX, String apellidoY){
        ArrayList<Medico> meds = this.cargarMedicos();
        int idBuscado = -1;
        
        for(Medico m: meds){
            if(m.getNombreMed().equals(nombreX) && m.getApellidoMed().equals(apellidoY)){
                idBuscado = m.getIdMed();
                m.baja();
            }
        }
        
        if(idBuscado != -1){
            ArrayList<Consulta> cons = this.cargarConsultas();
            
            for(Consulta c: cons){
                if(c.getIdMed() == idBuscado){
                    c.baja();
                }
            }
        }else{
            System.out.println("--MEDICO NO ENCONTRADO ("+nombreX+" "+apellidoY+")--");
        }
    }
    
    // cambiar dia consulta si es navidad o anio nuevo

    public void cambiarDiaConsulta(){
        ArrayList<Consulta> lista = this.cargarConsultas();
        for(Consulta c: lista){
            if (c.getMes().equals("Diciembre") && (c.getDia() == 25 || c.getDia() == 31)){
                int nuevoDia = c.getDia()-1;
                c.setDia(nuevoDia);
                c.alta();
                
            }
        }
    }

    
}
