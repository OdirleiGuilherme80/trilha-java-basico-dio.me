import java.util.Date;

public class TiposOperadores {

    public static void main(String []args){
        
        // classe de operadores java

        String nome = "Odirlei Guilherme";
        int idade = 44;
        double peso = 135.00;
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date(1980);
        
        System.out.println(("Meu nome é " + nome+",")+(" minha idade é " + idade)+(" ,peso atualmente "+peso)+(" sou do sexo "+ sexo)+(" se sou doador de orgão? "+doadorOrgao)+(" , nascido em " + dataNascimento));


        //Operadores aritméticos para realizar expressão matemáticas entre valores númericos

        // classe Operadores Java
        double soma = 15.5 + 20.5;

        System.out.println(soma);

        int subtração = 9 - 4;

        System.out.println(subtração);

        int multiplicação = 3 * 3;

        System.out.println(multiplicação);

        int divisão = 24 / 2;

        System.out.println(divisão);

        int resto = 18 % 3;

        System.out.println(resto);

        double resultado = (10 * 7) + (20 / 4);

        System.out.println(resultado);
       
        /*Ao utilizarmos o operador artmético ( + ) com uma String estaremos realizando uma concatenação de textos */

        String nomeCompleto = "Odirlei" + " Guilherme";

        System.out.println(nomeCompleto);

    }
}

    
