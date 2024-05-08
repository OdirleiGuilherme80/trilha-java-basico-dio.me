public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //falando sobre as variáveis primitivas:
        //byte, short, int, long, float, double,  boolean, char//
        
        // long e float são sempre representados com F ou f no final da variável float e L ou l para variável long
        // EXEMPLO:
        // float num1 = 11.5F; ou 11.5f;
        // long num2 = 2024L; ou 2024l;
        
        /*DICA:No exemplo abaixo colocamosum variável 
         * short dentro de um int, pos a variável short ocupa menos bytes
         * assim cabendo no int, porém o int é maior que o short ficando 
         * impossível encaixar o int dentro do short. para isso utilizamos
         * a técnica do CAST, assim abrimos um parenteses aplicamos um short a frente da variável int,
         * fazendo assim aplicabilidade do int dentro do short, mas evite usar tal façanha. 
         */
        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurtol2 = (short) numeroNormal1; //

        System.out.println(numeroNormal1);


    }
}
