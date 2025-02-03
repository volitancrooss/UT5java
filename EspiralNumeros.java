public class EspiralNumeros {
    private int n;

    public EspiralNumeros(int n) {
        this.n = n;
}

    public void generarEspiral(){

        int x = 0, y = 0, dx = 0, dy = 1, temp;
        for (int i = 1; i <= n * n; i++) {
            // Imprimir el número en la posición actual
            System.out.printf("%4d", i);
            // Mover a la siguiente posición
            if (x + dx >= n || x + dx < 0 || y + dy >= n || y + dy < 0 || (x + dx == y + dy && x + dx == n / 2)) {
                temp = dx;
                dx = dy;
                dy = -temp;
            }
            x += dx;
            y += dy;
            // Imprimir una nueva línea al final de cada fila
            if (i % n == 0) {
                System.out.println();
            }
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        EspiralNumeros espiral = new EspiralNumeros(5); // Puedes cambiar el tamaño aquí
        espiral.generarEspiral();
    }
    
    }
