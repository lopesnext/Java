/*
**Exercicio17_C
*Desenvolva um programa que:
*Mostre os números impares dentro de um intervalo de números escolhido pelo 
*utilizador.
*Use o Ciclo do... while, for e if
 */
package eercicio17_c;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Eercicio17_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
        
        int num1=0, num2=0,i;
        int contadorPar=0, contadorImpar=0;
        System.out.print("Insira o primeiro numero: ");
        
        num1 = input.nextInt();
        
         System.out.print("Insira o segundo numero: ");
        
        num2 = input.nextInt();
        
        
        
        for ( i=num1+1; i <= num2-1; i++) {
            
             
            if (i %2 == 0){
                contadorPar = contadorPar +1;
             //System.out.print("par ");
            } else {
                contadorImpar = contadorImpar +1;
                 System.out.print(i+" ");
            }
        }
        System.out.print("-> Total de numeros impares "+contadorImpar);
         
    }
    
}
