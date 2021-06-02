/*
 *Exercicio16_CDesenvolva um programa que:Leia um conjunto indeterminado 
**detemperaturas, e informe no final a menor e a maior temperaturasinformadas,
**bem como a média das temperaturas.
 */
package exercicio16_c;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio16_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       Scanner input = new Scanner(System.in);
        
        double temperatura ;
        
        double maiorTemp = Integer.MAX_VALUE;
        
        double menorTemp = Integer.MIN_VALUE;
        
        double somaTemp = 0, mediaTemperaturas = 0;
                     
        int i, numTemp = 0;
        
        int flag =0;
        
        System.out.println("Insira quantas temperaturas pretende "
                + "introduzir:");
        
        numTemp = input.nextInt();
        
        for (i = 1; i <= numTemp; i++) {
            
            
                      
            System.out.println("Insira a "+i+ "ª temperatura:");
                     
            temperatura = input.nextDouble();
           
            somaTemp = somaTemp + temperatura;
            
                             
             if (temperatura < maiorTemp) {
                 
                 maiorTemp = temperatura;
                                                                                  
             } 
             else if (temperatura > menorTemp) {
             
                    menorTemp = temperatura;
            } 
             
             else {
                 
                 
           } 
 
    }   
        
        if (maiorTemp != menorTemp) {
        
        // efetua o calculo da media
        mediaTemperaturas = somaTemp / numTemp;
        
         System.out.println("Total de temperaturas introduzidas:"
                 + ""+numTemp);
          System.out.println("A temperatura mais elevada foi de: "
                  + ""+maiorTemp+"ºc");
          System.out.println("A temperatura mais baixa foi de:"
                  + " "+menorTemp+"ºc");
           System.out.println("A media da temperatura foi de: "
                   +mediaTemperaturas+"ºc");
        }else {
            System.out.println("Total de temperaturas introduzidas:"
                 + ""+numTemp);
          System.out.println("As temperatura mais elevada é idêntica à"
                  + " temperatura mais baixa que foi de : "
                  + ""+maiorTemp+"ºc");
         
           System.out.println("A media da temperatura foi de: "
                   +mediaTemperaturas+"ºc");
            
        }  
    }
    
}