package ejercicio2;

public abstract class Figura {
    // atributo
    private String color;
    // constructor
    public Figura(String color){
        this.color = color;
    }
    // metodos no abstractos
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Figura de color: " + color;
    }

    // metodos abstractos
    public abstract double area();

    public abstract double perimetro();
}
