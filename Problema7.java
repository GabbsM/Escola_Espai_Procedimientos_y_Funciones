public class Problema7 {
    //Problema 7
    //Escribe una función de resultado boolean que reciba un parámetro entero (int) y que responda a la
    //pregunta de si el parámetro es un nombre par (el resultado ha de ser true si el nombre dado es par y
    //false si es impar). Decidid cual ha de ser la cabecera de esta función.

    public static void main(String[] args) {

        // El numero 4 es par por lo tanto nos tiene que devolver TRUE
        System.out.println();
        System.out.println(parOImpar(4));

        // El numero 7 es impar por lo tanto nos tiene que devolver FALSE
        System.out.println();
        System.out.println(parOImpar(7));

    }

    public static boolean parOImpar(int num){
        boolean res;
        if (num % 2 == 0){
            res = true;
        }
        else {
            res = false;
        }
        return res;
    }
}
