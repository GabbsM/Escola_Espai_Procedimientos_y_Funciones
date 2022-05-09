public class Problema3 {
    //Problema 3
    //Escribe un programa que obtenga (lea) tres números reales (a, b y c) y calcule la suma de sus valores
    //absolutos. Por ejemplo, si los números leídos son 12.1, -4.0 y -3.2 el resultado sería 19.3.
    //NOTA: Utilizad, obligatoriamente, la función: private static double valab (double x) que calcula el
    //valor absoluto de su parámetro.

    public static void main(String[] args) {

        double n1,n2,n3;
        n1 = 74;
        n2 = 73;
        n3 = 94;
        double ValorAbsoluto = valab(n1) + valab(n2) + valab(n3);
        System.out.println();
        System.out.println("El valor absoluto de los tres numeros es: " + ValorAbsoluto);


    }

    private static double valab(double x){
        double res = Math.abs(x);
        return  res;
    }
}
