import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Problema8 {
    //Problema 8
    //Escribe un programa que lea 3 números enteros (int) y que de como resultado la suma de los que son
    //pares. Por ejemplo, si los números son 15, 16 y 14 el resultado tendría que ser 30 (la suma de 16 y 14),
    //mientras que si los números dados son 22, 15 y 19 el resultado tendría que ser 22. Este programa ha de
    //utilizar, obligatoriamente, la función escrita en el ejercicio anterior.

    public static void main(String[] args) {

        //Hacemos una prueba metiendo por consola los numeros 2,5,7. El resultado ha de ser 2 e indicarnos
        //que es FALSE

        //Hacemos otra prueba metiendo por consola los numeros 4,6,8. El resultado ha de ser 18 y
        // nos ha de indicar que es TRUE

        System.out.println();
        System.out.println(parOImpar());

    }

    public static boolean parOImpar() {
        int contador = 0;
        boolean res = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el numero 1");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            contador +=num1;
        }
        System.out.println("Indica el numero 2");
        int num2 = sc.nextInt();
        if (num2 % 2 == 0) {
            contador +=num2;
        }
        System.out.println("Indica el numero 3");
        int num3 = sc.nextInt();
        if (num3 % 2 == 0) {
            contador +=num3;
        }else {
            res = false;
        }


        System.out.println("El total de la suma de los numeros pares es " + contador);
        return res;
    }


}


