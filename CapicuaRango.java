public class CapicuaRango {
    
    private int limiteInferior;
    private int limiteSuperior;

    // Constructor que recibe los límites inferior y superior
    public CapicuaRango(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    // Método que verifica si un número es capicúa
    private boolean esCapicua(int numero) {
        int aux = numero;
        int invertido = 0;
        while (aux > 0) {
            invertido = invertido * 10 + aux % 10;
            aux /= 10;
        }
        return numero == invertido;
    }

    // Método que muestra todos los números capicúas dentro del rango
    public void mostrarCapicuas() {
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        CapicuaRango capicuaRango = new CapicuaRango(100, 200); // Puedes cambiar los límites aquí
        capicuaRango.mostrarCapicuas();
    }
}