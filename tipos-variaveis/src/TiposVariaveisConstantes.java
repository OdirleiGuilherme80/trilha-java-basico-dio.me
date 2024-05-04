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

        System.out.println(pi);

        
        /*EXEMPLO 2: Maneira correta de escrever o valro de pi como onstante 
        ou seja não sofrea alteração de valor 
        a palavra final seguido variavel primitiva double 
        mais nome da variável em caixa alta.*/
       
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        
        
        //EXEMPLO 3:
        // jeito correto de aplicar uma variavél constante// 
         final double VALOR_DE_PI2 = 3.14; 
        
         double valor_de_pi2 = 7.15;
        
         VALOR_DE_PI2 = valor_de_pi2; //Erro!!
        
         /*acima a lógica criada tende a apresentar erro, pois com VALOR_DE_PI
         * não pode sofrer alteração de valor, nunca será possivel valor_de_pi2 e seu valor
         * serem atribuidos a VALOR_DE_PI. 
         */
        double resultadoPi2 = VALOR_DE_PI2;

        System.out.println(VALOR_DE_PI2);
    

}

}