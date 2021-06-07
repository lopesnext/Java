/*
 Exercício 5Desenvolva um programa que aceite dois inteiros e imprima a soma, 
 a diferença, o produto, a média, o máximo (o maior dos dois inteiros), o mínimo
(menor dos dois Inteiros).
 */
package testeexercicio_5;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class TesteExercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valor1,valor2, maior,menor;
        
        System.out.print("Insira o primeiro inteiro");
        
        valor1 = input.nextInt();
        
        System.out.print("Insira o segundo valor inteiro");
        
        valor2 = input.nextInt();
        
        if (valor1 > valor2){
            maior = valor1;
            menor = valor2;
            
        }else {
            maior = valor2;
            menor = valor1;
        }
        System.out.println("Diferença= "+(valor2-valor1));
        System.out.println("Soma= "+valor1+valor2);
        System.out.println("Media= "+(valor1+valor2)/2);
        System.out.println("produto= "+valor1 * valor2); 
        System.out.println("maior valor"+ maior);
        System.out.println("menor valor"+ menor);
    } 
    
    
}
