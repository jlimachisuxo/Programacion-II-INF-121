package ejercicio2;

public class Circulo extends Figura {
    // atributo
    private double radio;
    // constructor'
    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }

    // implementacion de los metodos abstractos area y perimetro
    @Override
    public double area(){
        return Math.PI *radio * radio;
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString(){
        return "Circulo [radio= " + radio + ", " + super.toString();
    }
}


