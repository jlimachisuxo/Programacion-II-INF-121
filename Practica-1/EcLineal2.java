/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
/**
 *
 * @author Joshelyn
 */
public class EcLineal2 {
    // atributos
    private double a, b, c;
    // constructor
    EcLineal2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    // metodo que devuelve la discriminante
    public double getDiscriminante(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    // metodo para obtener la raiz 1
    public double getRaiz1(){
        double disc = getDiscriminante();
        if(disc >= 0){
            return (-this.b + Math.sqrt(disc)) / (2 * this.a);
        }
        else{
            return 0;
        }
    }
    // metodo para obtener la raiz 2
    public double getRaiz2(){
        double disc = getDiscriminante();
        if(disc >= 0){
            return (-this.b - Math.sqrt(disc)) / (2 * this.a);
        }
        else{
            return 0;
        }
    }
}
