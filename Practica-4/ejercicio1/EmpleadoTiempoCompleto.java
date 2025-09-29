package ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {
    // atributo
    private double salarioAnual;

    // constructor
    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }

    // metodos
    @Override
    public double CalcularSalarioMensual() {
        return salarioAnual / 12;
    }

    @Override
    public String toString() {
        return "Empleado de Tiempo Completo [nombre= " + nombre + ", Salario anual" + salarioAnual + "]";                
    }
}


