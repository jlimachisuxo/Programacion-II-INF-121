/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Joshelyn
 */
public class EstadisticaProgModular {
    // PROGRAMACION MODULAR-ESTRUCTURADA
    // metodo para calcular el promedio
    public static double promedio(double[] datos){
        double suma = 0;
        for(int i=0; i<datos.length; i++){
            suma += datos[i];
        }
        return suma / datos.length;
    }
    //metodo para calcular la desviacion estandard
    public static double desviacion(double[] datos, double promedio){
        double sdc = 0;
        for(int i=0; i<datos.length; i++){
            sdc += Math.pow(datos[i] - promedio, 2);
        }
        return Math.sqrt(sdc / (datos.length - 1));
    }
    
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        // solicitando al usuario ingresar 10 numeros
        System.out.print("Ingrese 10 numeros: ");
        for(int i=0; i<10; i++){
            datos[i] = sc.nextDouble();
        }
        //calculando
        double calcPromedio = promedio(datos);
        double calcDesviacion = desviacion(datos, calcPromedio);
        //mostrando resultados
        System.out.println("El promedio es: " + calcPromedio);
        System.out.println("La desviacion estandard es: " + calcDesviacion);
    }
    
}
