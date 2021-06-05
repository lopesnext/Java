/*
 *Escrever um programa para determinar o consumo médio de um automóvel sendo 
**ornecida a distância total percorrida pelo automóvel e o total de 
*combustível gasto.
 */
package exercicio7;

import java.util.Scanner;
/**
 *
 * @author lopes
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variaveis 
        double Combust;
        double Dist;
        double Gasto;
        int Med = 100;
        double valorLitro;
        double valorGasto;
        double gastoTotal;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println ("Insira o combustível gasto");
        
        Combust = input.nextDouble();
        
        System.out.println("Insira a distância percorrida");
        
        Dist = input.nextDouble();
        
        System.out.println("Insira o valor por Litro de combustível");
        
        valorLitro = input.nextDouble();
        
        Gasto = Combust / Dist * Med;
        
        gastoTotal = Combust * valorLitro;
        
        valorGasto = Gasto * valorLitro;
        
        System.out.println("A média de combustível gasto foi de: " 
                + String.format("%.2f" ,Gasto)+ " Litros por 100 Km");
        
        System.out.println("O valor gasto cada 100Km perecorridos foi de: " 
                + String.format("%.2f" ,valorGasto)+ " Euros");
        
        System.out.println("O valor total gasto, foi de: " 
                + String.format("%.2f" ,gastoTotal)+ " Euros");
        
            
        
    }
}
    

