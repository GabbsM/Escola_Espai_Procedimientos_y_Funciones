public class Problema11 {
    //Problema 11
    //Escribe una función que reciba como parámetro un número entero positivo (int) y que calcule la suma
    //de todos los números entre 1 y el número dado. Por ejemplo, cuando el parámetro sea 7 el valor devuelto
    //por la función tendría que ser la suma 1+2+3+4+5+6+7 (o sea 28)

    public static void main(String[] args) {
        sumaDigitos(7);

    }

    public static void sumaDigitos(int num){
        int suma = 0;
        for (int i = 1; i < num+1 ; i++) {
            suma+=i;
        }
        System.out.println("La suma de los numeros es " +  suma);
    }
}
