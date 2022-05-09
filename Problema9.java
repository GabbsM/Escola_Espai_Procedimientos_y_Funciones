import java.util.Scanner;

public class Problema9 {
    //Problema 9
    //Se quiere escribir un programa que dados tres números enteros calcule la suma de los que acaban en 4
    //o 7. Una posibilidad para resolver este problema es:
    //a) Escribe una función que dado un numero entero devuelva su último dígito (el de las unidades)
    //b) Escribe una función que dado un numero entero indique si este finaliza con 4 o 7. Se debe utilizar la
    //función anterior.
    //c) Escribe el programa que se pide utilizando la función del apartado anterior.

    public static void main(String[] args) {

        ultimoNumero();
    }

    public static void ultimoNumero(){
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Indica un numero: ");
            int num = sc.nextInt();

            int ultimoNumero = num % 10;
            if(ultimoNumero == 4 || ultimoNumero == 7){
                suma+=ultimoNumero;
            }

        }
        System.out.println("La suma de los numeros cuya ultima cifra es cuatro o siete es: " + suma);


    }
}
