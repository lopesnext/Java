/*
**Exercicio13_B
**Desenvolva um programa que:
**Verifique se a letra digitada é vogal ou consoante
 */
package exercicio13_b;

import java.util.Scanner;
/**
 *
 * @author lopes
 */
public class Exercicio13_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner input = new Scanner (System.in);
        
      //Variavel do tipo char, para recebr so um caracter!!
      // Tentei usar o o char, mas o scanner não estava a colaborar,
      //Certamente não será "nextLine"!!!!
      
      String letra;
        
      //Fazaemos display da mensagem ao utilizador, pedindo uma letra!
      
      System.out.println("Insira uma letra");
      
     //Recebemos o valor introduzido na nossa variavel!
      letra = input.nextLine();
      
      
      switch  (letra) {
              
              case "a" :
                      case "e":
                      case "i":
                      case "o":
                      case "u":
                  System.out.println(letra+" é uma vogal");
                  break;
              default:
                   System.out.println(letra+" é uma consoante");
                   break;
                   
      }
                  
    }
    
}
