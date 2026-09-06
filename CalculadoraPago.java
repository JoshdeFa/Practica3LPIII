package Ejercicio_1;

public class CalculadoraPago {

    public double calcularPagoMensual(Empleado empleado) {
        return empleado.getSalario() / 12;
    }
}
