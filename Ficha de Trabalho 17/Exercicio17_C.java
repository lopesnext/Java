/*
* Exercicio17_D
**Desenvolva um programa que:
**Mostre a tabuada escolhida pelo utilizador.
 */
package exercicio17_d;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio17_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
        
          int i,j,resultado,tabuada;
          
        System.out.print("Insira a tabuada que pretende: ");
        
        tabuada = input.nextInt();
        
         
        
        for (i=1; i<=10; i++) {
        
            
              resultado = tabuada * i;
             
             System.out.println(+tabuada+ "x" +i+ "="+ resultado);
          
        }
        }
        
       
    }
    

    