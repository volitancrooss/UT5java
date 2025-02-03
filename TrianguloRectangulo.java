public class TrianguloRectangulo {
    
    private int altura;

    // Constructor
    public TrianguloRectangulo(int altura) {
        this.altura = altura;
        }
    
    // Método para dibujar el triángulo
    public void dibujarTriangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Método principal para probar la clase
    public static void main(String[] args) {
        TrianguloRectangulo triangulo = new TrianguloRectangulo(10); // Puedes cambiar la altura aquí
        triangulo.dibujarTriangulo();
    }
}