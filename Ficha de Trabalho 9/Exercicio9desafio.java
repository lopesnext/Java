 /*
 *Construir um programa em que o utilizador insira um número. 
*Se o numero for maior que 10 deverá imprimir a palavra “Aprovado”, 
*caso seja inferior a 10, deverá aparecer o texto “Reprovado”.
*Desafio: Pedir dois valores ao utilizador, fazer a média e testar as 
*seguintes hipóteses:
*Média >=10 – aprovado
*Média <10 – reprovado
*Média =9 – em recuperação
 */
package exercicio9desafio;

import java.util.Scanner; // importa a classe scanner

/**
 *
 * @author lopes
 */
public class Exercicio9desafio {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        double nota1, nota2, somaNotas;;
        int mediaCalc = 2;
        double mediaFinal;
                    
         Scanner input = new Scanner(System.in);
         
              
        System.out.println("Insira o valor da primeira nota :");
        
        nota1 = input.nextInt();
        
        System.out.println("Insira o valor da segunda nota :");
        
        nota2 = input.nextInt();
        
        mediaFinal = (nota1 + nota2) / mediaCalc;
        
        if (nota1 >= 10) {
            
            System.out.println("O aluno foi aprovado : " + mediaFinal);
            
        }
        
        else if  (nota1==9) {
         System.out.println("O aluno está em recuperação :" + mediaFinal);      
         
         }
           
        else {
            
               
        System.out.println("O aluno reprovou:" + mediaFinal ) ;
        
}
        
        } 
}
         
        
    
    

