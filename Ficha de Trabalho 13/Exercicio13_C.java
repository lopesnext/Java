/*
 Exercicio13_CDesenvolva um programa que:Determine qual é a idade 
que o utilizador tem no ano atual. 
Para isso solicite o ano de nascimento do utilizador e o ano atual.
 */
package exercicio13_c;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio13_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anoNascimento, anoAtual, idade;
        
        int dataNascimento;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o ano do seu nascimento");
        
        anoNascimento = input.nextInt();
        
        System.out.println("Insira o ano atual");
        
        anoAtual = input.nextInt();
        
       idade = anoAtual - (anoNascimento); 
       
       System.out.println(idade+ "Anos");
    }
    
}
