public class TiposOperadoresTernario{
    public static void main (String[]args){
        /* Operadores ternários utilizamos (? mais :) são uitilizados para casos verdadeiro ou falsosboolean */

        int a, b, c, d;
        a = 5;
        b = 5;
        c = 2;
        d = 2;

        String resultado = a==b? "Verdadeiro" : "Falso";
        String resultado2 = c!=d? "Verdadeiro" : "Falso";


        System.out.println(resultado);

        System.out.println(resultado2);

    }
}