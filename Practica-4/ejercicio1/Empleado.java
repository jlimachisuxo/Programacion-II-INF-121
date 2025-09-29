package ejercicio1;

public abstract class Empleado{
    // atributo
    protected String  nombre;
    // constructor
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    // metodo abstracto
    public abstract double CalcularSalarioMensual();

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado: [nombre= " + nombre + "]";
    }
}

