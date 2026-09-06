package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        GestorGrafico gestor = new GestorGrafico();

        Forma circulo = new Circulo();
        Forma rectangulo = new Rectangulo();
        Forma triangulo = new Triangulo();

        gestor.renderizarForma(circulo);
        gestor.renderizarForma(rectangulo);
        gestor.renderizarForma(triangulo);
    }
}