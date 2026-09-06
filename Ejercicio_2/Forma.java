package Ejercicio_2;

public interface Forma {
    void dibujar();
}

class Circulo implements Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class Rectangulo implements Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}


class Triangulo implements Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
}