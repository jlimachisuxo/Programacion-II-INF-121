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
public class TestEstadistica {
    // POO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        // solicitando al usuario que ingrese 10 numeros
        System.out.print("Ingrese 10 numeros: ");
        for(int i=0; i<10; i++){
            datos[i] = sc.nextDouble();
        }
        // instancia de un objeto de la clase Estadistica
        Estadistica est = new Estadistica(datos);
        // lamando a los metodos
        System.out.println("El promedio es: "+est.promedio());
        System.out.println("La desviacion estandard es: "+est.desviacion());
    }
}
