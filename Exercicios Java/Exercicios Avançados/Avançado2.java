/*
 Avancado2:
Os números primos possuem várias aplicações dentro da Computação, por exemplo na 
Criptografia. Um número primo é aquele que é divisível apenas por um e por ele 
mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não 
um número primo.
 */
package avançado2;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Avançado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
      
      int numPrimo=0,numDivisores=0;
      
      System.out.println("Insira um numero inteiro:");
      
      numPrimo = input.nextInt();
      
      for  (int i=1; i<=numPrimo; i++) {
         
            if (numPrimo % i == 0) {
        numDivisores++;
            }
      }      
    if (numDivisores == 2) {
        
        System.out.println("O numero "+numPrimo +"é primo");
            
          }else {
          System.out.println("O numero "+numPrimo +"não é primo");
      }
    
      }
      
    
}
 

