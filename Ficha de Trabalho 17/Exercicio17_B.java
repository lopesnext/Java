/*
 **Exercicio17_B
*Desenvolva um programa que:
*Mostre as 10 tabuadas (1 ao 10) usando ciclo for.
 */
package exercicio17_b;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio17_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        int tabuada =1, resultado=0, i=0;
  
        do {
        for ( i=0; i <=10; ++i ) {
            
            
            resultado = tabuada * i; 
            
            System.out.println(+tabuada+ "x" +i+ "=" +resultado);
            
        if (i == 10){
            tabuada = tabuada +1;
            
        }
            
        }  
        
        }while (tabuada <=10);
        
                
                }      
                       
    }
    
        // Sem o ciclo WHILE
        
             
    /**    
            int i,j, resultado;
        
        for (i=1; i<=10; i++)
        {
            
            System.out.println();
            
            for ( j=1; j<=10; j++)
            {
                resultado = i*j;
                System.out.println(+i+ " x " +j+ " = " +resultado);
            }
            
            
        }
        
        
        
    }
            
  */          
        
        
            
             
       
        
               
                   
                       
    

