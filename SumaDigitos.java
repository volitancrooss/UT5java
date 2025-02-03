public class SumaDigitos {

    private int numero;

    // Constructor
    public SumaDigitos(int numero) {
        this.numero = numero;
        }

    // Método para sumar los dígitos
    public int sumaDigitos() {
        int suma = 0;
        int n = numero;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
            }
            return suma;
            }

    // Método principal para probar la clase
    public static void main(String[] args) {
        SumaDigitos sum = new SumaDigitos(12345); // Puedes cambiar el número aquí
        System.out.println("La suma de los dígitos de " + sum.numero + " es: " + sum.sumaDigitos());
    }
        
    
}