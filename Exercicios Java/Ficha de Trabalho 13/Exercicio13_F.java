/*
 Exercicio13_E
*Desenvolva um programa que:
*Receba do utilizador o nome de um mês. Exiba o número equivalente.
*Ex: janeiro é o mês 1
*Para evitar repetir maiúsculas e minúsculas, use o comando equalsIgnoreCase
**Exemplo:
*if(mes.equalsIgnoreCase("Janeiro")){
*System.out.println("O Número do mês é 1");
*Realize este exercício usando, também, o Switch… case e grave com o nome
*Exercicio13_F
*switch (mes.toLowerCase()) { ou mes.toUpperCase – converte para maiúsculas 
*ou minusculas
*Nota: mês é o nome da variável
 */
package exercicio13_f;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio13_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
        String nomeMes;
        
        System.out.print("Insira o nome do Mês: ");
        
        nomeMes = input.nextLine();
            
        
        switch (nomeMes.toLowerCase()) {
            
             case "janeiro":
                System.out.print(nomeMes+" é o mês (1)");
                break;
             case "fevereiro":
                System.out.print(nomeMes+" é o mês (2)");
                break;
             case "marco":
                System.out.print(nomeMes+" é o mês (3)");
                break;
             case "abril":
                System.out.print(nomeMes+" é o mês (4)");
                break;
             case "maio":
                System.out.print(nomeMes+" é o mês (5)");
                break;           
            case "junho":
                System.out.print(nomeMes+" é o mês (6)");
                break;
            case "julho":
                System.out.print(nomeMes+" é o mês (7)");
                break;    
            case "agosto":
                System.out.print(nomeMes+" é o mês (8)");
                break;    
            case "setembro":
                System.out.print(nomeMes+" é o mês (9)");
                break;    
            case "outubro":
                System.out.print(nomeMes+" é o mês (10)");
                break;  
            case "novembro":
                System.out.print(nomeMes+" é o mês (11)");
                break;   
            case "dezembro":
                System.out.print(nomeMes+" é o mês (12)");
                break;  
                
            default:
                System.out.print(nomeMes+" não existe ou contém algum erro"
                     + "ortográfico!");
                
        }            
    }
    
}
