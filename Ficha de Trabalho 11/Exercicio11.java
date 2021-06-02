/*
 Usando Switch… case
*Desenvolva um programa que:
*Pergunte o género da pessoa. Peça para digitar:
*f ou F - feminino
*m ou M - masculino
*Default: Valor inválido!
*Imprima a mensagem "É do sexo feminino ou masculino" conforme o caso.
 */
package projetox;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String genero;
                   
         Scanner input = new Scanner(System.in);
         
          System.out.println("Insira o genero da pesssoa:");
        
        genero = input.nextLine();
        
        
       switch (genero) {
           
           case "M":
            case "m":
              System.out.println("Masculino:");
               break;
           case "F":
            case "f":
               System.out.println("Feminino:");
                break; 
           default:
                System.out.println("Opção inválida:");
                break;
       } 
    }
    
}
