package ejercicio2;

public class Cuadrado extends Figura implements Coloreado {
    // atributo
    private double lado;
    // constructor
    public Cuadrado(double lado, String color){
        super(color);
        this.lado = lado;
    }

    // implementacion del metodo abstracto area() y perimetro() de Figura
    @Override
    public double area(){
        return lado * lado;
    }

    @Override
    public double perimetro(){
        return 4 * lado;
    }

    // implementacion del metodo de la interfaz Coloreada
    @Override
    public String comoColorear(){
        return "Colorear los cuatro lados";
    }

    @Override
    public String toString(){
        return "Cuadrado [lado= " + lado + ", " + super.toString() + "]";
    }
}
