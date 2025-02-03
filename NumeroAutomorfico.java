public class NumeroAutomorfico {
    
    private int numero;

        // Constructor que recibe un número entero
        public NumeroAutomorfico(int numero) {
            this.numero = numero;
        }
    
        // Método que determina si el número es automórfico
        public boolean esAutomorfico() {
            int cuadrado = numero * numero;
            String numeroStr = String.valueOf(numero);
            String cuadradoStr = String.valueOf(cuadrado);
            return cuadradoStr.endsWith(numeroStr);
        }
    
        // Método principal para probar la clase
        public static void main(String[] args) {
            NumeroAutomorfico numeroAutomorfico = new NumeroAutomorfico(25); // Puedes cambiar el número aquí
            if (numeroAutomorfico.esAutomorfico()) {
                System.out.println("El numero es automorfico");
            } else {
                System.out.println("El numero no es automorfico");
            }
        }

}
