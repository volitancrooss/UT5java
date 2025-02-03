// Creación del constructor de la clase CuadradoHueco

import java.util.Scanner;

public class CuadradoHueco {
    private int tamaño;

    public CuadradoHueco(int tamaño) {
        this.tamaño = tamaño;
    }

    // Método para dibujar un cuadrado hueco
    public void dibujarCuadrado() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      
        CuadradoHueco cuadrado = new CuadradoHueco(5);
        cuadrado.dibujarCuadrado();
    }
}
