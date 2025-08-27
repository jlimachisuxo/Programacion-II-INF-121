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
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //solicitando al usuario ingresar los valores
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = sc.nextDouble(), d = sc.nextDouble();
        double e = sc.nextDouble(), f = sc.nextDouble();
        
        // instancia de un objeto de la clase EcuacionLineal
        EcuacionLineal ec1 = new EcuacionLineal(a, b, c, d, e, f);
        // verificando si la ecuacion tiene solucion
        if(ec1.tieneSolucion()){
            System.out.println("x = " + ec1.getX() + ", " + "y = " + ec1.getY());
        }
        else{
            System.out.println("La ecuacion no tiene solucion.");
        }
    }
}
