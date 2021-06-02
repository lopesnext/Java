 /*
 *Construir um programa em que o utilizador insira um número. 
*Se o numero for maior que 10 deverá imprimir a palavra “Aprovado”, 
*caso seja inferior a 10, deverá aparecer o texto “Reprovado”.
 */
package exercicio9;

import java.util.Scanner; // importa a classe scanner

/**
 *
 * @author lopes
 */
public class Exercicio9 {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        int nota1;
                    
         Scanner input = new Scanner(System.in);
         
              
        System.out.println("Insira o valor da nota :");
        
        nota1 = input.nextInt();
        
        if (nota1 >= 10) {
            
            System.out.println("O aluno foi aprovado :");
            
        }
        
        else if  (nota1==9) {
         System.out.println("O aluno está em recuperação :");      
         
         }
           
        else {
               
            
        System.out.println("O aluno reprovou:");
        
}
        
        } 
}
         
        
    
    

