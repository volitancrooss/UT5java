public class Fibonacci{
    private int cantidadTerminos;

    // Constructor que recibe la cantidad de términos de la serie Fibonacci
    public Fibonacci(int cantidadTerminos){
        this.cantidadTerminos = cantidadTerminos;
    }

     // Método que genera e imprime la secuencia de Fibonacci
    public void generarSecuencia(){
        int a = 0, b = 1;
        for(int i = 0; i <cantidadTerminos; i++){
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(10);
        fibonacci.generarSecuencia();
    }

}