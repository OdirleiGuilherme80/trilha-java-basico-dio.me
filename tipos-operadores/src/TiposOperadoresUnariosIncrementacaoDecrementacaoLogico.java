public class TiposOperadoresUnariosIncrementacaoDecrementacaoLogico {
    public static void main(String[] args) {
       
        /*NÚMEROS UNÁRIOS INCREMENTAR, DECREMENTAR E VERDADEIRO OU FALSO (TRUE OR FALSE)
         * Eles realizam alguns trabalhos básicos como incrementar E decrementar.
         * inverter valores numéricos e booleanos
         * 
         * (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade.
         * 
         * (--) Operador unário de decremento de valor - decrementa o valor de 1 unidade.
         * 
         * (!) Operador unário lógico de negação - nega o valor de uma expressão booleana.
        */
        
        int numero = 6;
        int numero1 = 5;
        int numero2 = 2;
        

        //Quero realizar x repetições

        numero1 = numero1 + 1;
        
        System.out.println(" A variável numero1 originalmente é um 5, mas depois que encrementamos\r\n" + 
        "dessa forma NUMERO = NUMERO + 1, a variável numero passou de 5 para 6.\n");
        System.out.println(numero1 +"\n");
        
        System.out.println("Mas podemos reduzir essa expressão dessa forma NUMERO ++ \r\n" +
        "para encrementar a variavel numero2 que tem como valor o 2 e ira ficar com 3 ao imprimir\n");
       
        numero2++;
        
        System.out.println(numero2+"\n");

        System.out.println("Ou dessa forma na hora de imprimir, System.out.println (NUMERO ++)\r\n"+
        "o resultado impresso será 6, pois se prestarmos atenção, primeiro solicitamos a impressão do valor original\r\n"+
        "e em seguida a incrementação, logo, após dermos o comando System.out.println(numero)\r\n"+
        "teremos o resultado com a incrementação com o resultado 7.\r\n");
        System.out.println(numero ++);
        System.out.println(numero+"\n");

        System.out.println("Para ocorrer primeiro a incrementação  e o resultado sair do jeito correto \r\n"+
        "colocamos os sinais ++ antes de chamar a variável. Exemplo System.out.println(++ NUMERO), o resultado impresso será diferente de 7, pois acabamos de encrementar mais uma unidade.");
        System.out.println(++ numero +"\n");

        System.out.println("As mesmas regras valem para decrementação (--)\n\n\n");

        System.out.println("Abaxo criaremos uma variável booleana com status verdadeiro e resultado impresso será falso,\r\n"+
        "ou vice-vesar poderiamos dizer que é falso e sair verdadeiro\n");
        boolean teste = true;
        boolean teste2 = true;

        System.out.println("Hoje é dia de prova, mas Carlos pra trollar seu amigo vai dizer que não.\n");

        System.out.println("Miguel fala: Carlos tem prova hoje? e o mesmo responde: " + (!teste+"\n"));

        System.out.println("Mas como no caso anterior da unário positvo e negativo, se realizar outra impressão o resultado é true.\n");
        System.out.println(teste+"\n");

        System.out.println("criei a variavel teste2 com status tambem verdadeiro, mas quero que fique falso constatementeo para isso aplicamos\r\n"+
         "TESTE2 = !TESTE2, a mesma coisa que fizemos nos unários positivo e negativo. mesmo sendo true toda vez que imprimir será false.\n");
        teste2 = !teste2;

        System.out.println(teste2);

        
        
        
        
    }
}
    

