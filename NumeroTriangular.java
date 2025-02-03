public class NumeroTriangular {
    
    private int n;

    // Constructor que recibe un número entero
    public NumeroTriangular(int n) {
        this.n = n;
    }

    // Método que verifica si un número es triangular

    public void mostrarSerie() {
        for (int i = 1; i <= n; i++) {
            int numeroTriangular = (i * (i + 1)) / 2;
            System.out.println("Número triangular " + i + ": " + numeroTriangular);
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        NumeroTriangular numeroTriangular = new NumeroTriangular(10); // Puedes cambiar el valor de n aquí
        numeroTriangular.mostrarSerie();
    }

}
