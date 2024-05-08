public class TiposVariaveisConstantes {

    public static void main(String[]args){

        /*constantes valores alocados em memorias que
        não podem ser modficados. por exemplo o valor
        de pi que é 3.14. para realizar essa copnstante
        temos que aplicar a palvra final e escrver variável em caixa
        alta.
     */ 
        //EXEMPLO1:

        double pi = 3.14;
        double pi2 = 5.17;
        pi = pi2;
        double resultadoPi = pi;

        System.out.println(pi + " --> Resultado referente ao exemplo 1 \n");

        
        /*EXEMPLO 2: Maneira correta de escrever o valro de pi como onstante 
        ou seja não sofrea alteração de valor 
        a palavra final seguido variavel primitiva double 
        mais nome da variável em caixa alta.*/
       
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI + "  --> Resultado referente ao exemplo 2 \n");
        
        
        //EXEMPLO 3:
        /* Jeito correto de aplicar uma variavél constante mas a mesma apresentara erro// 
        código abaixo -->

         final double VALOR_DE_PI2 = 3.14; 
        
         double valor_de_pi3 = 7.15;
        
         VALOR_DE_PI2 = valor_de_pi2; //Erro!!!!!!!

          double resultadoPi2 = VALOR_DE_PI2;

          
         fim de código <----
        
         /* Acima a lógica criada tende a apresentar erro, pois com a variável VALOR_DE_PI2
         * não pode sofrer alteração de valor, nunca será possivel atribuir o valor_de_pi3 a variável VALOR_DE_PI2. 
         */
        System.out.println("O Resultado é ERRO!! no exemplo 3 que encontra-se em forma de comentário no código.\n");

    

}

}