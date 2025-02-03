public class SumaImpares{
    private int limeteinferior;
    private int limitesuperior;

    public SumaImpares(int limeteinferior, int limitesuperior){
        this.limeteinferior = limeteinferior;
        this.limitesuperior = limitesuperior;
    }

    public void sumarImpares(){
        int suma = 0;
        for (int i = limeteinferior; i <= limitesuperior; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números impares entre " + limeteinferior + " y " + limitesuperior + " es: " + suma);
    }

    public static void main(String[] args) {
        SumaImpares suma = new SumaImpares(1, 100); // Puedes cambiar los límites aquí
        suma.sumarImpares();
    }
}