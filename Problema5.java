public class Problema5 {
    //Problema 5
    //Escribe una función con la siguiente cabecera:
    //private static double maxi (double a, double b, double c)
    //que devuelva el máximo de tres parámetros dados.

    public static void main(String[] args) {

        System.out.println();
        System.out.println("El numero mayor de los tres es: ");
        System.out.println(maxi(5,7,12));

    }

    private static double maxi (double a, double b, double c){

        double res = Math.max(a,Math.max(b,c));
        return res;
    }

}
