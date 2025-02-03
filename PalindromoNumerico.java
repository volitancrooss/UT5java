public class PalindromoNumerico {
    
  private int numero;

    // Constructor que recibe un número entero
    public PalindromoNumerico(int numero) {
        this.numero = numero;
        }

        // Método que verifica si un número es palíndromo
        public boolean esPalindromo() {
            int aux = numero;
            int invertido = 0;
            while (aux > 0) {
                invertido = invertido * 10 + aux % 10;
                aux /= 10;
            }
            return numero == invertido;
        }
            
            // Método principal para probar la clase
            public static void main(String[] args) {
                PalindromoNumerico palindromo = new PalindromoNumerico(12321);
                if (palindromo.esPalindromo()){
                    System.out.println("El número es palíndromo");
                }
                else
                 {
                    System.out.println("El número no es palíndromo");
                    
                }
                }

}
