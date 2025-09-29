package ejercicio1;

public class EmpleadoTiempoHorario extends Empleado {
    // atributos
    private double horasTrabajadas;
    private double tarifaPorHora;
    // constructor
    public EmpleadoTiempoHorario(String nombre, double horasTrab, double tarPorHora){
        super(nombre);
        this.horasTrabajadas = horasTrab;
        this.tarifaPorHora = tarPorHora;
    }
    // metodos
    @Override
    public double CalcularSalarioMensual(){
        return horasTrabajadas * tarifaPorHora;
    }
    @Override
    public String toString() {
        return "EmpleadoTiempoHorario [nombre= " + nombre + ", horas trabajadas= " + horasTrabajadas + ", tarifa por hora= " + tarifaPorHora + "]";
    }
}

