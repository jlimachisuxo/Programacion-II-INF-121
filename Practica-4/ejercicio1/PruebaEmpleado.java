package ejercicio1;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        // solicitando datos para e empleados a tiempo completo
        System.out.println("Introduce los datos de 3 empleados a tiempo completo: ");
        for(int i=0; i<3; i++){
            System.out.println("Empleado a tiempo completo #" + (i+1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        // solicitandom datos para 2 empleados de tiempo horario
        System.out.println("\nIntroduce los datos de 2 empleados de tiempo horario");
        for(int i=3; i<5; i++){
            System.out.println("Empleado de tiempo horario #"+ (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            double horTrabajdas = sc.nextDouble();
            System.out.print("Tarifa por hora: ");
            double tarPorHora = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoHorario(nombre, horTrabajdas, tarPorHora);
        }

        System.out.println("\nEmpleados registrados");
        for(Empleado empleado: empleados){
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario mensual: Bs." + String.format("%.2f", empleado.CalcularSalarioMensual()));
            System.out.println("");
        }

        sc.close();
    }   
}



