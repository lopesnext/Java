/*
 Exercício 4Desenvolva um programa que calcule o número médio de alunos por 
turma.Para isto, peça ao utilizador que indique a quantidade de turmas e a
quantidade de alunos para cada turma. As turmas não podem ter mais de 20 alunos.
Para a realização deste exercício use uma estrutura do... while.
 */
package testeexercicio_4;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class TesteExercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        int numTurmas, totalAlunos = 0,mediaAlunos,numAlunosTurma = 0;
        
        int i,flag =0;
            
        
        System.out.println("Insira a quantidade de turmas que pretende "
                + "introduzir:");
        
        numTurmas = input.nextInt();
        
        for (i = 1; i <= numTurmas; i++) {
            
            
           do{              
            System.out.println("Insira o numero de alunos da turma "+i+ ":");
                     
            numAlunosTurma = input.nextInt();
          
            flag = numTurmas;
            
             if (numAlunosTurma > 20) {
                 System.out.println("Maximo de 40 alunos por turma");
                 
             }
             else{
                
                 flag = +1;
             } 
            
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
