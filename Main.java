package Ejercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraPago calculadora = new CalculadoraPago();
        int opcion = 0;
        do {
            System.out.println("\n====== GESTIÓN DE EMPLEADOS ======");
            System.out.println("1. Registrar nuevo empleado y calcular pago");
            System.out.println("2. Salir");
            System.out.print("Elige una opción (1-2): ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.println("\n--- DATOS DEL EMPLEADO ---");
                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Salario total (anual): ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Departamento (ej. Ventas, IT): ");
                    String departamento = scanner.nextLine();
                    
                    // 1. Instanciar el POJO con los datos del teclado
                    Empleado empleado = new Empleado(nombre, salario, departamento);
                    
                    // 2. Delegamos el cálculo a la clase responsable (SRP)
                    double pagoMensual = calculadora.calcularPagoMensual(empleado);                 
                    System.out.println("\n--- RECIBO DE PAGO ---");
                    System.out.println("Empleado: " + empleado.getNombre());
                    System.out.println("Área: " + empleado.getDepartamento());
                    System.out.println("Sueldo Mensual a pagar: $" + pagoMensual);
                    break;

                case 2:
                    System.out.println("Cerrando el sistema de planillas. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta con un número del menú.");
            }
        } while (opcion != 2);
        
        scanner.close();
    }
}