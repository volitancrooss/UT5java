public class BinarioDecimal {
    
    private String numeroBinario;

    // Constructor que recibe un número binario
    public BinarioDecimal(String binario) {
        this.numeroBinario = binario;
    }

    // Método que convierte un número binario a decimal

    public int convertirADecimal() {
        int numeroDecimal = 0;
        int longitud = numeroBinario.length();
        for (int i = 0; i < longitud; i++) {
            if (numeroBinario.charAt(longitud - 1 - i) == '1') {
                numeroDecimal += Math.pow(2, i);
            }
        }
        return numeroDecimal;
    }

    // Método principal para probar la clase
       public static void main(String[] args) {
        BinarioDecimal binarioDecimal = new BinarioDecimal("1010"); // Puedes cambiar el número binario aquí
        int decimal = binarioDecimal.convertirADecimal();
        System.out.println("El número decimal es: " + decimal);
    }


}
