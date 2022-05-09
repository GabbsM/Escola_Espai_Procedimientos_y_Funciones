public class Problema6 {
    //Problema 6
    //Escribe una función con la siguiente cabecera:
    //private static boolean quad (int x, int y)
    //que responda a la pregunta de si x es el cuadrado de y (x=y2
    //)

    public static void main(String[] args) {


        System.out.println();
        System.out.println("X es el cuadrado de Y? : ");
        //Esta opcion devolvera FALSE
        System.out.println(quad(4,7));

        System.out.println();
        System.out.println("X es el cuadrado de Y? : ");
        //Esta opcion devolvera TRUE
        System.out.println(quad(2,2));


    }

    private static boolean quad (int x, int y){
        double newX = (double) x;
        double newY = (double) y;
        boolean respuesta;

        double numCuadrado = Math.pow(y,2);

        if(x == numCuadrado){
            respuesta = true;
        }else {
            respuesta=false;
        }
        return respuesta;
    }
}
