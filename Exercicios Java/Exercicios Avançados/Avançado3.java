/*
Avancado3:
Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será 
digitado pelo utilizador, mas a tabuada não deve necessariamente iniciar em 1 e 
terminar em 10, o valor inicial e final devem ser informados também pelo 
utilizador, conforme exemplo abaixo: 
Montar a tabuada de: 5 
 Começar por: 4 
 Terminar em: 7 
 Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
 5 X 4 = 20 
 5 X 5 = 25 
 5X 6 = 30 
 5 X 7 = 35 
Obs: Você deve verificar se o utilizador não digitou o final menor que o inicial.
 */
package avançado3;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Avançado3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int tabuada,num1,num2;
        
        System.out.println("Insira a tabuada que pretende");
        
        tabuada = input.nextInt();
        
        System.out.println("Inicia em que numero?");
        
        num1 = input.nextInt();
        
        System.out.println("Termina em que numero?");
        
        num2 = input.nextInt();
        if (num2 < num1){
           
             for (int i = num2; i <=num1; i++) {
          
            System.out.println(tabuada+ "x" +i+"=" +tabuada*i);
        }
        }else {
        
        
        for (int i = num1; i <=num2; i++) {
          
            System.out.println(tabuada+ "x" +i+"=" +tabuada*i);
        }
        }
    }
    
}
