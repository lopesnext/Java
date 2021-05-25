/*
**Exercicio14_E
**Desenvolva um programa que:
**receba dois números inteiros e gere os números inteiros que estão no 
**intervalo compreendido por eles.
 */
package exercicio14_e;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio14_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor1, valor2;
            
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor: ");
        
        valor1 = input.nextInt();
        
        System.out.println("Insira o segundo valor: ");
        
        valor2 = input.nextInt();
        
        // if para para haver a possibilidade de utilizador poder inverter
        // os valoresm sendo que prevê a introdulção de um valor maior no
        // valor1 e menor no valor2.
        if (valor1 < valor2) {
        
        for (valor1 = valor1 +1; valor1 < valor2; valor1++) {
                            
            System.out.printf(+valor1+" ");
        }
        }
        
        else if (valor1  > valor2) {
            for (valor2 = valor2 +1; valor2 < valor1; valor2++) {
            
            
            System.out.printf(+valor2+" ");
            }
        }
        else {
                System.out.printf("Não existem valores entre os numeros"
                        + "introduzidos !");
                    
        }
    }
    
}
    
    
    

