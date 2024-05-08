package edu.Odirlei.exercicio2;
public class ImprimirNomeMetodo {

public static void main (String[]args){
    String primeiroNome ="Regina Célia";
    String segundoNome = "da Silva";

    String nomeCompleto = nomeMae (primeiroNome, segundoNome);

    System.out.print(nomeCompleto);
}

public static String nomeMae(String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}
}