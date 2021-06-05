/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8_avancado_a;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio18_Avancado_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         Scanner input = new Scanner(System.in);
        
        int anoAtual; 
        
        int mesFevereiro;
        
        String nomeMes;
        
        System.out.println("Insira o nome do mes que pretende consultar: ");
        
        nomeMes = input.nextLine();
        
        System.out.println("Insira o ano atual: ");
        
        anoAtual = input.nextInt();
        
             
         
       if ((anoAtual % 400 ==0) || (anoAtual % 4 == 0 && anoAtual % 100 != 0)) {
           
             System.out.println("O ano é bissexto: ");
             mesFevereiro = 29;
        } else {
            
             System.out.println("O ano é comum");
             mesFevereiro = 28;
        }
        
        
                switch (nomeMes.toLowerCase()) {
            
             case "janeiro":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;
             case "fevereiro":
                System.out.print("O mes de "+nomeMes+" tem "
                        +mesFevereiro+ " dias");
                break;
             case "marco":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;
             case "abril":
                System.out.print("O mes de "+nomeMes+" tem 30 dias");
                break;
             case "maio":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;           
            case "junho":
                System.out.print("O mes de "+nomeMes+" tem 30 dias");
                break;
            case "julho":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;    
            case "agosto":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;    
            case "setembro":
                System.out.print("O mes de "+nomeMes+" tem 30 dias");
                break;    
            case "outubro":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;  
            case "novembro":
                System.out.print("O mes de "+nomeMes+" tem 30 dias");
                break;   
            case "dezembro":
                System.out.print("O mes de "+nomeMes+" tem 31 dias");
                break;     
            default:
                System.out.print(nomeMes+" não existe ou contém algum erro"
                     + "ortográfico!");
                
        }  
    }
    
}
