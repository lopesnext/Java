/*
 **18.Escreva um programa Java para converter minutos em vários anos e dias.
 */
package exercicio18;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int minutos, dias, anos;
       
      System.out.println("Insira quantos minutos pretende converter");
        
        minutos = input.nextInt();
        
        dias = (minutos / 60 / 24) % 365;
        
        anos = minutos / (60 * 24 * 365);
      
         System.out.println("Minutos = "+minutos); 
        
            System.out.println(" dias = " +dias);
        
               System.out.println("anos = "+anos);
   }
   
}


