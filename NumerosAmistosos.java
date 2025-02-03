public class NumerosAmistosos {
    private int amistoso1;
    private int amistoso2;

    // Constructor que recibe dos números enteros
    public NumerosAmistosos(int amistoso1, int amistoso2) {
        this.amistoso1 = amistoso1;
        this.amistoso2 = amistoso2;
        }
        
        // Metodo auxiliar que calcula la suma de los divisores de un número
        private int sumaDivisores(int n) {
            int suma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    suma += i;
                }
            }
            return suma;
        }

        // Metodo que verifica si dos números son amistosos
        public boolean sonAmistosos() {
            return sumaDivisores(amistoso1) == amistoso2 && sumaDivisores(amistoso2) == amistoso1;
        }
    
    // Método principal para probar la clase
    public static void main(String[] args) {
        NumerosAmistosos numAmistosos = new NumerosAmistosos(220, 284); // Puedes cambiar los números aquí
        System.out.println("¿Son amistosos?" + numAmistosos.sonAmistosos());

}
}