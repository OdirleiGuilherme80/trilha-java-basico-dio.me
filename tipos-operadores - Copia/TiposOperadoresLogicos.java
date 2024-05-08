public class TiposOperadoresLogicos {
    public static void main (String[]args){
        /*Operadores lógicos representam o recurso que nos permite criar
         * expressões lógicas maiores a partir da junção de duas ou mais expressões.
         * é nada mais nada menos que a concepção da tabela verdade.
         * && operador lógico "E", verifica se as duas condições são verdadeiras.
         * || operador lógico "OU", verifica se uma das condições são verdadeias.
         * 
         */

         boolean condicao1 = true;

         boolean condicao2 = true;

         if(condicao1 && condicao2){
            System.out.println("AS duas condições são verdadeiras \n"); //lembrando que && ele verifica se as duas condições são verdadeiras//
         }

         if(condicao1 || condicao2){
            System.out.println("AS uma das condições são verdadeiras \n"); //lembrando que || verifica se uma das condições são verdadeiras//
         }

         /*podemos fazer outros tipos de comparações criando novas condições, 
         veja que a resposta 3 vai ser identica a primeira, pois a condição criada também é verdadeira*/
         if(condicao1 && (25<50)){
            System.out.println("AS duas condições são verdadeiras\n"); 
         }


         System.out.println("FIM!");
    }
    
}
