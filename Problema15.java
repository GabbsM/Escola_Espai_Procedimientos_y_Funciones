import java.util.Scanner;

public class Problema15 {

    //Problema 15
    //Escribe una función de cabecera
    //private static int unidadMillar(int x)
    //que devuelva el digito correspondiente a las unidades de millar del parámetro. Por ejemplo si el valor
    //del parámetro es 7657 el resultado ha de ser 7, si el valor del parámetro es 78954 el resultado ha de ser
    //8. Si el valor del parámetro es inferior a 1000 el resultado será siempre 0.

    public static void main(String[] args) {

        System.out.println(unidadMillar(987));


    }

    private static int unidadMillar(int x){


        int uniMillar = (x/1000)%10;


        if (x < 1000){
            System.out.println("El resultado no puede ser menor que 1000");
        }

       return uniMillar;
        }
}


