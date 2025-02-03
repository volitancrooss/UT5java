public class Factorial {
    private int numero;

    // Constructor que recibe un número entero
    public Factorial(int numero) {
        this.numero = numero;
    }

    // Método que calcula el factorial de un número
    public int calcularFactorial() {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
        }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Factorial factorial = new Factorial(5); // Puedes cambiar el número aquí
        System.out.println("El factorial de " + factorial.numero + " es " + factorial.calcularFactorial());
    }

}
