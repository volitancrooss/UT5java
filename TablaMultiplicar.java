public class TablaMultiplicar {
    private int numero;

    // Constructor que recibe un número entero
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    // Método que genera e imprime la tabla de multiplicar del número desde el 1 hasta el 10
    public void generarTabla() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        TablaMultiplicar tabla = new TablaMultiplicar(5); // Puedes cambiar el número aquí
        tabla.generarTabla();
    }
}