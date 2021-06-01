/*
 18A. Escreva um programa Java que lê um número em polegadas,
converte-o em metros.Nota: Uma polegada é 0,0254 metro.
 */
package exercicio18_a;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio18_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        double totalPolegadas, polegadas, metros;
        
        double umMetroPoelgada = 0.0254;
        
        System.out.println("Insira quantos munitos pretende converter");
        
        polegadas = input.nextDouble();
        
        metros = polegadas * 0.0254;
       
       //TODO:limitar casas decimais 
      System.out.println(metros);

    }
    
}
