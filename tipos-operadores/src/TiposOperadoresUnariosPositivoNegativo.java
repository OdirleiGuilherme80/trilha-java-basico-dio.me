public class TiposOperadoresUnariosPositivoNegativo {
    public static void main(String[] args) {
        
        /*NÚMEROS UNÁRIOS OPERADORES UNÁRIOS POSITIVOS E NEGATIVOS*/
        /*Esses operadores são aplicados juntamente com um outro operador
         * aritmético. 
         * 
         * (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente
         * 
         * (-) Operador unário de valor negativo - nega um número ou expressão aritméica.
         *   
         */

         int numero = 10;
         
         System.out.println(numero);
         System.out.println("número impresso corretamente \n");
         System.out.println(" agora no exemplo abaix,o vamos imprimir essa variável com resultado negativo\n");
         
         /* no exemplo abaixo passaremos essa variável numero a imprimir resultado negativo */
         
         System.out.println(-numero+"\n");
         System.out.println("Legal imprimiu o resultado da variável em um número negativo, mas será que foi permanente? \r\n" + 
         " vamos imprimir novamente.\n");
         
          /*Legal imprimiu o resultado da variável em um número negativo, mas será que foi permanente? 
          * vamos imprimir novamente.
          */
          System.out.println(numero+"\n");
          System.out.println("Como vimos acima passou pra negativo, mas temporariamente, pois ela continua a ser positiva na variável original");

          /*A única maneira de deixar esse número permanentemente negativo é dessa forma */
          System.out.println("A única maneira de deixar esse número permanentemente negativo é dessa forma NUMERO = - NUMERO (caixa alta para descrever forma correta) ");

          numero = - numero;

          System.out.println(numero+"\n");
          System.out.println("Viu número agora tá permanentemente negativo\n ");

          System.out.println("Para voltar número a ser positivo novamente constante NUMERO = NUMERO * - 1 (caixa alta para descrever forma correta) ");
          numero = numero * -1;
          System.out.println(numero+"\n");
          System.out.println("número voltar a ser positivo permanente\n ");
        
    }
}
