/*
 *Exercicio16_A
**Desenvolva um programa que: calcule o número médio de alunos por turma.
**Para isto, peça a quantidade de turmas e a quantidade de alunos para 
cada turma.
**As turmas não podem ter mais de 40 alunos.
 */
package exercicio16_a;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio16_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numTurmas, totalAlunos = 0;
        
        int mediaAlunos;
        
        int numAlunosTurma = 0;
        
        int i;
        
        int flag =0;
        
        System.out.println("Insira a quantidade de turmas que pretende "
                + "introduzir:");
        
        numTurmas = input.nextInt();
        
        for (i = 1; i <= numTurmas; i++) {
            
            
           do{              
            System.out.println("Insira o numero de alunos da turma "+i+ ":");
                     
            numAlunosTurma = input.nextInt();
            // uso de variavel de controlo "flag"
            //  recebe o valor da variavel numTurmas, correspondente ao numero           
            //  de turmas, sendo que o cliclo for 
            //repete até esse valor, neste caso a flag, tem um contador,
            //que só adiciona 1 valor a cada acerto, sendo errado, repete com
            //o ciclo while
            flag = numTurmas;
            
             if (numAlunosTurma > 40) {
                 System.out.println("Maximo de 40 alunos por turma");
                 
             }
             else{
                 // qaundo não é introduzido o valor maior que 40 ele adiciona
                 // 1 á variavel flah, sendo que contem o numero de turmas 
                 //que a variavel numTurmas contem, finalizando sai do ciclo
                 flag = +1;
             } 
            // variavel totalAlunos recebe a soma de todos os alunos 
            totalAlunos = totalAlunos + numAlunosTurma;
            
          } while (flag == numTurmas);     
    }   
        
        // efetua o calculo da media
        mediaAlunos = totalAlunos / numTurmas;
         System.out.println("Em "+numTurmas+ " turmas");
          System.out.println("Existem no total " +totalAlunos+ " alunos");       
           System.out.println("Uma média de "+mediaAlunos+""
                   + " e alunos por turma");
    }
    
}
