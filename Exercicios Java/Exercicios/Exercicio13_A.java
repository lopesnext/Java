/*
 * Exercicio13_A 
**Faça um programa que:
    Leia um número e exiba o dia correspondente da semana.
(1 –Domingo, 2-Segunda, etc).
    *Se digitar outro valor deve aparecer valor inválido.
 */
package exercicio13_a;

import java.util.Scanner;
/**
 *
 * @author lopes
 */
public class Exercicio13_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variavel para receber valor da escolha utilizador 
        
        int escolhaDia = 0;
        
        Scanner input = new Scanner(System.in);
        
        //Display da mensagem a pedir um valor ao utilizador!!
        
        System.out.println("insira o numero do dia da semana correspondente"
        + " 1 - Domingo"
        + " 2 - Segunda"
        + " 3 - Terça"
        + " 4 - Quarta"
        + " 5 - Quinta"
        + " 6 - Sexta"
        + " 7 - Sábado");
        
        escolhaDia = input.nextInt();
        
        //Switch case pra determinar qual valor corresponde ao dia da semana!!
        
        switch (escolhaDia) {
            
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("O numero introduzido não é válido!");
        }
    }
    
}
