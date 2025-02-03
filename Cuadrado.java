import java.util.Scanner;

public class Cuadrado {
    private int tamaño;

    // Constructor que inicializa el tamaño del cuadrado
    public Cuadrado(int tamaño) {
        this.tamaño = tamaño;
    }

    // Método para dibujar el cuadrado relleno
    public void dibujarCuadrado() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = scanner.nextInt();
        Cuadrado cuadrado = new Cuadrado(tamaño);
        cuadrado.dibujarCuadrado();
    }
}