/*
 *2. Escrever um programa que leia o nome de um funcionário, o seu salário fixo 
**e o total de vendas efetuadas por ele no mês (em dinheiro). Este funcionário 
**ganha 5% de comissão sobre suas vendas efetuadas. Deste modo, o programa deve
**mostrar o nome do funcionário, o ordenado e o valor do ordenado com a 
**respetiva comissão no final do mês.
 */
package preptesteexercicio_2;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class PrepTesteExercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String nomeVendedor;
        double salarioFixo;
        double totalVendas;
        double ganhoComiss;
        double salarioFinal;
        double valorComiss = 0.05; // percentagem de comissão vendedor 
        
        
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
                + String.format("%.2f" , salarioFixo)+ " Euros" );
                
        System.out.println("Salário final: "
               + String.format("%.2f" , salarioFinal)+ " Euros" );
                
               
    }
    
}
