public class Main {
    public static void main(String[] args) {
    
        //a) alta de 3 medicos
        Medico medico1 = new Medico(1, "Juan", "Perez", 10);
        medico1.alta();
        Medico medico2 = new Medico(2, "Laura", "Lopez", 5);
        medico2.alta();
        Medico medico3 = new Medico(3, "Carlos", "Ramirez",8);
        medico3.alta();

        // alta a 9 consultas
        Consulta consulta1 = new Consulta(123456, "Ana", "Gomez", 1, 15, "Marzo", 2025);
        consulta1.alta();
        Consulta consulta2 = new Consulta(234567, "Luis", "Martinez", 2, 20, "Abril", 2025);
        consulta2.alta();
        Consulta consulta3 = new Consulta(345678, "Marta", "Sanchez", 3, 5, "Mayo", 2025);
        consulta3.alta();
        Consulta consulta4 = new Consulta(456789, "Pedro", "Diaz", 1, 10, "Junio", 2025);
        consulta4.alta();
        Consulta consulta5 = new Consulta(567890, "Sofia", "Fernandez", 2, 25, "Julio", 2025);
        consulta5.alta();
        Consulta consulta6 = new Consulta(678901, "Jorge", "Torres", 3, 30, "Agosto", 2025);
        consulta6.alta();
        Consulta consulta7 = new Consulta(789012, "Lucia", "Ruiz", 1, 12, "Septiembre", 2025);
        consulta7.alta();
        Consulta consulta8 = new Consulta(890123, "Diego", "Morales", 2, 18, "Octubre", 2025);
        consulta8.alta();
        Consulta consulta9 = new Consulta(901234, "Elena", "Cruz", 3, 22, "Noviembre", 2025);
        consulta9.alta();
        Consulta consulta10 = new Consulta(912345, "Mario", "Vega", 2, 25, "Diciembre", 2025);
        consulta10.alta();

        
        Consultorio consultorio = new Consultorio("archivoMedicos","archivoConsultas" );

        //b) baja de medico por nombre y apellido y sus consultas
        System.out.println("-------ANTES------");
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();

        consultorio.bajaMedNomXApY("Juan", "Perez");
        
        System.out.println("\n\n-------DESPUES------");
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();

        //c) cambiar dia de consulta si es navidad o anio nuevo
        System.out.println("\n\n-------ANTES DE CAMBIAR DIA------");
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();

        consultorio.cambiarDiaConsulta();
        System.out.println("\n\n---------DESPUES------");
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();



    }
}
