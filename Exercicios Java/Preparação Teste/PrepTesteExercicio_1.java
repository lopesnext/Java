/*
** 1. Escrever um programa que leia o nome de um aluno e as notas dos três testes
*que ele obteve no ano letivo. No final, o programa deve mostrar o nome do aluno
*e a sua média (aritmética). 
*MEDIA = (nota1 + nota2 + nota3) / 3
 */
package preptesteexercicio_1;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class PrepTesteExercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         String aluno;
         
         double nota1,nota2,nota3,mediaNotas;
         
         System.out.print("Insira o nome do aluno: ");
         
         aluno = input.nextLine();
         
         System.out.print("Insira o valor da primeira nota: " );
         
         nota1 = input.nextInt();
         
         System.out.print("Insira o valor da segunda nota: " );
         
         nota2 = input.nextInt();
         
         System.out.print("Insira o valor da segunda nota: " );
         
         nota3 = input.nextInt();
         
         mediaNotas = (nota1 + nota2 + nota3) / 3; 
         
         
         System.out.print("O aluno "+aluno+ " teve média de: "
                 + String.format("%.2f", mediaNotas));
         
    }
    
}
