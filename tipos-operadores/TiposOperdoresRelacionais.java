public class TiposOperdoresRelacionais {

    public static void main (String[]args){
    /* Operadores Relacionais avaliam a relação entre duas 
    variáveis ou expressão. Definem se o operando á esquerda é igual, diferente, menor, maior.
    menor ou igual, maior ou igual, retornando um valor booleano
    (==) representação de igualdade
    (!=) representação de diferença
    ( > ) representação de Maior
    ( < ) representação de Menor
    ( >= ) representação de igual Maior
    ( <= ) representação igual Menor*/

    int valor1 = 33; 
    int valor2 = 75;

    
    boolean simNao = valor1 == valor2;

    System.out.println("Valor1 é igual ao Valor2? " + simNao +"\n");

    simNao = valor1 != valor2;

    System.out.println("Valor1 é diferente ao Valor2? " + simNao +"\n");

    simNao = valor1 > valor2;

    System.out.println("Valor1 é maior ao Valor2? " + simNao +"\n");

    simNao = valor1 < valor2;

    System.out.println("Valor1 é menor ao Valor2? " + simNao +"\n");

    simNao = valor1 >= valor2;

    System.out.println("Valor1 é maior ou igual ao Valor2? " + simNao +"\n");

    simNao = valor1 <= valor2;

    System.out.println("Valor1 é menor ou igual ao Valor2? " + simNao +"\n");

    /*POr meio relacionalpodemos tambem aplicalos para string
     * Exemplo:
     */
        String nome1 = "Odirlei";
        String nome2 = "Odirlei";

        System.out.println("Aqui no Primeiro exemplo Nome1 é igual ao Segundo Nome2? ");
        System.out.println(nome1==nome2);

    /*Mas se colocarmos um new nome (objeto novo) qual vai ser o resultado? */
    /*Percaba se validarmos o relacional com == o código não irá rodar pois o 
     * comportamento é diferente entre números e strings ainda mais na forma objeto
     * para compararmos esses dois objetos temos que utilizar o ( .equals ) no lugar do (==)
     */
        String name1 = "Guilherme";
        String name2 = new String ("Guilherme");

        System.out.println(" No exemplo 2, o Primeiro Nome é igual ao Segundo Nome? ");
        System.out.println(name1.equals(name2));
       // System.out.println(name1==name2);


    }
    
}

