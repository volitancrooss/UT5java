public class NumeroPerfecto {

    private int numero;

    public NumeroPerfecto(int numero) {
        this.numero = numero;
    }
    // Método que verifica si un número es perfecto
    public boolean esPerfecto() {
        int suma = 0;
        // Se suman los divisores propios del número
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
    }
    return suma == numero;
    }

// Método principal para probar la clase
    public static void main(String[] args) {
        NumeroPerfecto perfecto = new NumeroPerfecto(28);
        if (perfecto.esPerfecto()) {
            System.out.println("El número es perfecto");
        } else {
            System.out.println("El número no es perfecto");
        }
    }
}

