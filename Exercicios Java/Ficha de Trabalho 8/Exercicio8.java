  /*
 *Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
*total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
*vendedor ganha 15% (0,15) de comissão sobre suas vendas efetuadas, 
*informar o seu nome, o salário fixo e salário no final do mês.
 */
package exercicio8;

import java.util.Scanner; // importa a classe scanner

/**
 *
 * @author lopes
 */
public class Exercicio8 {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nomeVendedor;
        double salarioFixo;
        double totalVendas;
        double ganhoComiss;
        double salarioFinal;
        double valorComiss = 0.15; // percentagem de comissão vendedor 
        
        
         Scanner input = new Scanner(System.in);
         
         
        System.out.println("Insira o nome do vendedor:");
        
        nomeVendedor = input.nextLine();
        
        System.out.println("Insira o salario fixo do vendedor:");
        
        salarioFixo = input.nextInt();
                   
        System.out.println("Insira o valor das vendas efetuadas este mês:");
        
        totalVendas = input.nextDouble();
        
        //Calcula a percentagem de vendas com o valor mensal de vendas
        ganhoComiss = totalVendas * valorComiss;
        
        //adiciona a comissão sobre as vendas ao salario fixo 
        salarioFinal = salarioFixo + ganhoComiss;
        
        System.out.println("Nome Vendedor; " + nomeVendedor);
        
        System.out.println("Salário fixo: " 
                + String.format("%.2f" , totalVendas)+ " Euros" );
                
        System.out.println("Salário final: "
               + String.format("%.2f" , salarioFinal)+ " Euros" );
                
               
    }
    
}
