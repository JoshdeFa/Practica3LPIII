package Ejercicio_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        ImpresoraBasica impresora = new Impresora();
        ImpresoraConEscaner impresoraMultifuncional = new ImpresoraMultifuncional();

        do {
            System.out.println("\n====== CENTRO DE IMPRESIÓN ======");
            System.out.println("1. Usar Impresora Básica (Solo imprimir)");
            System.out.println("2. Usar Impresora Multifuncional (Imprimir y Escanear)");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opción (1-3): ");
            
            opcion = scanner.nextInt();

            System.out.println("---------------------------------");
            switch (opcion) {
                case 1:
                    System.out.println("Iniciando tarea en Impresora Básica...");
                    impresora.imprimir();
                    System.out.println("Tarea completada");
                    break;

                case 2:
                    System.out.println("Iniciando tareas en Impresora Multifuncional...");
                    impresoraMultifuncional.imprimir();
                    impresoraMultifuncional.escanear();
                    System.out.println("Tarea completada");
                    break;

                case 3:
                    System.out.println("Apagando equipos. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}