public class ContadorVocales {
    private String texto;

    // Constructor que recibe un texto
    public ContadorVocales(String texto) {
        this.texto = texto;
    }

    // Método que cuenta las vocales en el texto
    public int contarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador; 
}

    // Método principal para probar la clase
    public static void main(String[] args) {
        ContadorVocales contador = new ContadorVocales("Hola Mundo");
        System.out.println("El texto tiene " + contador.contarVocales() + " vocales");
    }

}
