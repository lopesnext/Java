/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18_avancado_b;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio18_Avancado_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        int valor1=0,valor2=0, soma, media, maiorValor=0, menorValor=0; 
        
        int diferValores =0, i=0;
        
        System.out.println("Insira o primeiro valor inteiro: ");
        
        valor1 = input.nextInt();
        
              System.out.println("Insira o segundo valor inteiro: ");
  
        valor2 = input.nextInt();
        
        soma = valor1 + valor2;
        
        media = (valor1 + valor2) / 2;
        
        if (valor1 > valor2) {
            
           maiorValor = valor1; 
           menorValor = valor2;
           
            for (i=0; i <= valor1; i++) {
            
            //diferValores = diferValores +1;
        }
             
           
        }else if (valor2>valor1) {
            
            maiorValor = valor2;
            menorValor = valor1;   
            
              for (i=valor1; i <= valor2; i++)  {
            
           //  diferValores = diferValores +1;
        }
        }
        
        System.out.println("A soma é de: " + soma);
           System.out.println("A media é de: " + media);
            System.out.println("Maior valor: " + maiorValor);
              System.out.println("Menor valor: " + menorValor);
              System.out.println("diferença entre valores é de: " + i);
    }
    
}
