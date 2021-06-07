/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13_d;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio13_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        int anoNascimento, anoAtual, idade;
        
        int menorIdade = 18;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o ano do seu nascimento");
        
        anoNascimento = input.nextInt();
        
        System.out.println("Insira o ano atual");
        
        anoAtual = input.nextInt();
        
       idade = anoAtual - (anoNascimento); 
       
       if (idade < menorIdade) {
           System.out.println("É menor de idade");
       }
       else{
           System.out.println("É maior de idade");
       }
                
       
       System.out.println(idade+ "Anos");
    }
    
}
    
    

