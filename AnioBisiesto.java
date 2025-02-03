public class AnioBisiesto {
    private int anio;

    // Constructor que recibe un año
    public AnioBisiesto(int anio) {
        this.anio = anio;
    }

        // Método que verifica si un año es bisiesto
    public boolean esBisiesto() {
        if (anio % 4 == 0 ) {
            return true;
        } else {
            return false;
        }
    }

        // Método principal para probar la clase
        public static void main(String[] args) {
            AnioBisiesto anioBisiesto = new AnioBisiesto(2028); // Puedes cambiar el año aquí
            if (anioBisiesto.esBisiesto()) {
                System.out.println("El año " + anioBisiesto.anio + " es bisiesto");
            } else {
                System.out.println("El año " + anioBisiesto.anio + " no es bisiesto");
            }
        }

}
