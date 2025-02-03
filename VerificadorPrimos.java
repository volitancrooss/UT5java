public class VerificadorPrimos{
    
    private int entero;

    // Constructor que recibe un número entero
    public VerificadorPrimos(int entero){
        this.entero = entero;
    }

    // Método que verifica si el número es primo
    public boolean esPrimo(){
        if (entero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(entero); i++) {
            if (entero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Método principal para probar la clase
    public static void main(String[] args) {
        VerificadorPrimos primo = new VerificadorPrimos(1); 
        if (primo.esPrimo()) {
            System.out.println("El número " + primo.entero + " es primo");
        } else {
            System.out.println("El número " + primo.entero + " no es primo");
        }
    }
}
