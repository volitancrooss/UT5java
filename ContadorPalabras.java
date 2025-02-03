public class ContadorPalabras {
    private String texto;

    // Constructor que recibe un texto
    public ContadorPalabras(String texto) {
        this.texto = texto;
    }

    // Método que cuenta las palabras en el texto
    public int contarPalabras() {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
        
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras("Hola mundo, soy un programador");
        System.out.println("Número de palabras: " + contador.contarPalabras());
        }

}
