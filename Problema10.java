public class Problema10 {
    //Se quiere escribir un programa que sea capaz de escribir la tabla de multiplicar de un número dado.
    //Por ejemplo, si a este programa se le da el número 7 escribirá:
    //7 x 0 = 0
    //7 x 1 = 7
    //7 x 2 = 14
    //…
    //7 x 10 = 70
    //Una manera de resolver este problema es escribiendo primero un procedimiento que sea capaz de
    //escribir en la pantalla una línea de cualquier tabla de multiplicar. Este procedimiento tiene la siguiente
    //cabecera:
    //private static void lineaTabla(int taula, int fila )
    //Con parámetros 7 y 3 este procedimiento escribiría la línea correspondiente a 7 x 3 (tabla del 7),
    //mientras que con parámetros 8 y 5 escribirá la línea correspondiente a 8 por 5 (tabla del cinco):
    //Escribe:
    //a) El procedimiento lineaTabla
    //b) El programa que resuelve el problema planteado utilizando el procedimiento lineaTabla

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Linea tabla: ");
        lineaTabla(4,8);
        System.out.println();
        System.out.println("Tabla de multiplicar:");
        tablaMultiplicar(6);

    }

    private static void lineaTabla(int taula, int fila ){
        System.out.println(taula + " * " + fila + " = " + taula*fila);
    }

    private static void tablaMultiplicar(int num){
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
