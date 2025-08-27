/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
/**
 *
 * @author Joshelyn
 */
public class Estadistica {
    // atributos
    private double[] datos;
    // contructor
    public Estadistica(double[] datos){
        this.datos = datos;
    }
    // metodo para calcular el promedio
    public double promedio(){
        double suma = 0;
        // longitud del vector
        double ndatos = this.datos.length;
        for(int i=0; i < ndatos; i++){
            suma += this.datos[i];
        }
        return suma / ndatos;
    }
    // metodo para calcular la desviacion estandar
    public double desviacion(){
        double prom = this.promedio();
        double sdc = 0; // sdc=suma diferencia de cuadrados
        double ndatos = this.datos.length;
        for(int i = 0; i < ndatos; i++){
            sdc += Math.pow(this.datos[i] - prom, 2);
        }
        return Math.sqrt(sdc / (ndatos - 1));
    }
}
