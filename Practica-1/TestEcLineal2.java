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
public class TestEcLineal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // solicitando al usuario el valor de los coeficientes
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble(); 
        double b = sc.nextDouble(); 
        double c = sc.nextDouble();
        
        // instancia de un objeto de la clase EcLineal2
        EcLineal2 ec = new EcLineal2( a, b, c);
        // obteniendo el discriminante
        double disc = ec.getDiscriminante();
        // mostrando el resultado segun el discriminante 
        if(disc > 0){
            // se  muestran las dos raices
            System.out.println("La ecuacion tiene dos raices " + ec.getRaiz1()+" y "+ec.getRaiz2());            
        }
        else{
            if(disc == 0){
                // muestra la unica raiz
                System.out.println("La ecuacion tiene una raiz " + ec.getRaiz1());
            }
            else{
                System.out.println("La ecuacion no tiene raices reales.");
            }
        }
        
        
    }
}
