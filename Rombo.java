public class Rombo {
    
    private int tamaño;

    public Rombo(int tamaño) {
        this.tamaño = tamaño;
    }

    //  Método para dibujar el rombo

    public void dibujarRombo() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = tamaño - 2; i >= 0; i--) {
            for (int j = 0; j < tamaño - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //  Método principal para probar la clase
    public static void main(String[] args) {
        Rombo rombo = new Rombo(5); // Puedes cambiar el tamaño aquí
        rombo.dibujarRombo();
    }

}
