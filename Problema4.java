public class Problema4 {
    //Problema 4
    //Igual que el anterior pero que calcule el valor absoluto de la suma (cuidado no es lo mismo el valor
    //absoluto de la suma que la suma de los valores absolutos)

    public static void main(String[] args) {

        double num1,num2,num3;
        num1=5;
        num2=4;
        num3=56;

        double sumaVA = valab(num1,num2,num3);
        System.out.println();
        System.out.println("El valor absoluto de la suma es " + sumaVA);


    }

    private static double valab(double uno,double dos,double tres){
        double res = Math.abs(uno + dos + tres);
        return res;
    }
}
