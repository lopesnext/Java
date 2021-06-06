/*
*3. Faça um programa para a leitura de duas notas de um aluno. 
**O programa deve calcular a média 
**alcançada por aluno e apresentar:
**Aprovado - se a média for maior ou igual a nove;
**Reprovado – se a média for menor do que nove;
**Em recuperação – se a média for entre 7 e 8.
 */
package preptesteexercicio_3;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class PrepTesteExercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1,nota2,mediaFinal;
        
        System.out.println("Insira a primeira nota do aluno");
        
        nota1 = input.nextDouble();
        
        System.out.println("Insira a segunda nota aluno");
        
        nota2 = input.nextDouble();
        
        mediaFinal = (nota1+nota2) / 2;
        
         if (mediaFinal >= 9) {
             System.out.print("Aluno aprovado com media de: " +mediaFinal);
             
         }else if (mediaFinal <7) {
             System.out.print("Aluno reprovado com media de: " +mediaFinal);
         }else if (mediaFinal ==7 || mediaFinal ==8) {
             System.out.print("Aluno em recuperação com media de: " +mediaFinal);            
         }      
        
    }
    
}
