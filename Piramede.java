public class Piramede {
    
    private int altura;

    //Constructor que recibe un entero para determinar la altura de la pirámide
    public Piramede(int altura) {
        this.altura = altura;
    }

    // Método que dibuja una pirámide de asteriscos de la altura indicada

    public void dibujarPiramide(){
        
        for(int i = 0; i<altura; i++){
           
            //Imprimir espacios en blanco
            for(int j = 0; j < altura -i -1; j++){
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for(int k = 0; k < (2*i) + 1; k++){
                System.out.print("*");
            }
            
            //Nueva linea despues de cada fila
            System.out.println();
        }
        
    }


    // Método principal para probar la clase
    public static void main(String[] args) {
        Piramede piramide = new Piramede(5); 
        piramide.dibujarPiramide();
    }
}