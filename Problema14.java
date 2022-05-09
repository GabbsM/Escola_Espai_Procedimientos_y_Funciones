import java.util.Scanner;

public class Problema14 {
//Problema 14
//Utilizando la función pot del ejercicio anterior escribe un programa que escriba la tabla de las 5
//primeras potencias de un número dado (que el programa leerá). Por ejemplo, si el número dado es 3 el
//resultado será:
//3 elevado a 1 es 3
//3 elevado a 2 es 9
//3 elevado a 3 es 27
//3 elevado a 4 es 81
//3 elevado a 5 es 243

    public static void main(String[] args) {

            pot();
    }

    private static int pot(){
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Indica el numero del que sacaremos las 5 primeras potencias: ");
        int num=sc.nextInt();
        for (int i = 1; i < 6; i++) {
            double potencia = Math.pow(num,i);
            System.out.println(num + " elevado a " + i + " es " + potencia);
        }
        return num;
    }

}
