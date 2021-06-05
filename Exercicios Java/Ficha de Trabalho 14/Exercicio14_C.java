/*
Exercicio14_C
**Desenvolva um programa que:
**leia 5 números e informe o maior número.
**Deve usar a um ciclo IF
**Desafio: usar int maior = Integer.MIN_VALUE; 
**para atribui um valor mínimo inicial à variável maior. 
**Se não usarem esta expressão, vão ter que atribuir um valor a essa variável 
**quando declarada (ex: 0)
 */
package exercicio14_c;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio14_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
        int i, num;
        int maiorValor = Integer.MIN_VALUE;
      
       // int menorValor = Integer.MIN_VALUE;
        
       // variavel "i" começa com o valor 0, sendo que irá repetir, 
       //adicionando 1 a mesma variavel "i" até o valor de "i" ser maior 5 
       // contando o numero de repetições que pretendemos, neste caso 5
        for (i=0; i<5; i++) {
            
           System.out.println("Insira um numero inteiro: ");  
           
           num = input.nextInt();
           
           // sempre que o numero introduzido pelo utilizador, for maior que
           // o valor já em memória na variavel, é substituido pelo valor maior
           // sendo que inicia com "Integer.MIN_VALUE;", determinando um 
           // valor minimo, como poderiamos simplesmente iniciar a variavel 
           // com valor 0
           if (num > maiorValor) {
               
              maiorValor = num;                   
              
           }
                      
        }
        
        System.out.println("O maior valor introduzido foi "+maiorValor); 
       
        
    }
    
}
