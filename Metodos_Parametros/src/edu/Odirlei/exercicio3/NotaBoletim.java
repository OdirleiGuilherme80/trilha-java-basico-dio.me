package edu.Odirlei.exercicio3;
public class NotaBoletim {
    public static void main(String[]args){
        /*digite nota do aluno para ver se o mesmo foi aprovado ou não, podendo
        ir para prova final, caso média seja igual a 6*/
        double mediaFinal = 6.1;
            if(mediaFinal < 6)
                System.out.println("Aluno(a) Reprovado");
            else if (mediaFinal == 6)
                System.out.println("Aluno(a) prova Final");
            else
                System.out.println("Aluno(a) Aprovado parabéns, curta as férias!!");
    }
}
