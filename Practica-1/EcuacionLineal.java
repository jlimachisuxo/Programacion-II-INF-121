/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
/**
 *
 * @author Joshelyn
 */
public class EcuacionLineal {
    // atributos
    private double a, b, c, d, e, f;
    // constructor
    public EcuacionLineal(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    // metodo para verificar si tiene solucion
    public boolean tieneSolucion(){
        return (this.a * this.d - this.b * this.c) != 0;
    }
    // metodo para obtener la solucuion de x
    public double getX(){
        if(tieneSolucion()){
            return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        }
        else{
            return 0;
        }
    }
    // metodo para obtener la solucuion de y
    public double getY(){
        if(tieneSolucion()){
            return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
        }
        else{
            return 0;
        }
    }
}
