package Ejercicio_4;

public class ImpresoraMultifuncional implements ImpresoraConEscaner {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando documento...");
    }
}