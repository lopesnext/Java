
package exercicio6;

import java.util.Scanner;

/**
 *Ecrever um programa que receba dois números e ao final mostre a soma, 
 * subtração, multiplicação e a divisão dos números lidos
 * @author Bruno.L
 */
public class Exercicio6 {
             
    public static void main(String[] args) {
    
    // Declaração das variaveis de tipo inteiro  
    // são os atributos
    int Num1;   
    int Num2;    
    int Soma;   
    int Sub;
    int Mult;
    int Div;
    
    // Entrada de dados introduzidos pelo utilizador    
    Scanner sc = new Scanner(System.in);
        
        //Display da frase "Insira o primeiro valor"
        System.out.println("Insira o primeiro valor");
        
        // A variavel "Num15" recebe o valor introduzido pelo utilizador
        Num1 = sc.nextInt();
        
        //Display da frase "Insira o segundov alor"
        System.out.println("Insira o segundo valor");
        
        //A variavel "Num2" recebe o segundo valor introduzido pelo utilizador 
        Num2 = sc.nextInt();
        
        //As operações aritméticas onde cada variavel recebe o valor 
        //da operação realizada
        Soma = Num1 + Num2;
        Sub = Num1 - Num2;
        Mult = Num1 * Num2;
        Div = Num1 / Num2;
        
        // Dysplay do resultado da soma
        System.out.println("O resultado da soma é: " + Soma);
         
        // Dysplay do resultado da subtração
        System.out.println("O resultado da subtração é: " + Sub);
        
        // Dysplay do resultado da multiplicação 
        System.out.println("O resultado da multiplicação é: " + Mult);
        
        // Dysplay do resultado da divisão
        System.out.println("O resultado da divisão é: " + Div);
        
    }
    
}
