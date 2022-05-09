import java.util.Scanner;

public class Problema12 {
    //Problema 12
    //Escribe un programa que lea un número n (n>=1) y que escriba la tabla de las sumas entre 1 y todos
    //los números menores o iguales que n. Por ejemplo, si el número dado fuera 6, el resultado tendría que
    //ser:
    //La suma de 1 a 1 es 1
    //La suma de1 a 2 es 3
    //La suma de 1 a 3 es 6
    //La suma de 1 a 4 es 10
    //La suma de 1 a 5 es 15
    //La suma de 1 a 6 es 21
    //Para resolver este problema escribe un procedimiento que haciendo uso de la función del ejercicio
    //anterior escriba una única línea de la tabla.

    public static void main(String[] args) {

        sumaDigitos();

    }

    public static void sumaDigitos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero: ");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < num+1 ; i++) {
            suma+=i;
            System.out.println("La suma de 1 a " +  i + " es: " + suma );
        }

    }

}
