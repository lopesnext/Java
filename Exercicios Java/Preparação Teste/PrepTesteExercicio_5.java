/*
 *5. Desenvolva um programa que:
**Mostre o número do mês, quando o utilizador escreve o nome do mês.
**Para a realização deste exercício, use uma estrutura IF.
**Use o comando: variável.equalsignoreCase(“”) para que o programa ignore se
**escreve maiúsculas ou minúsculas.
 */
package preptesteexercicio_5;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class PrepTesteExercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner (System.in);
        
        String nomeMes;
        
        System.out.print("Insira o nome do Mês: ");
        
        nomeMes = input.nextLine();
        
        if (nomeMes.equalsIgnoreCase("janeiro")) {
            System.out.print(nomeMes+" é o mês (1)");
        }
        else if (nomeMes.equalsIgnoreCase("fevereiro")) {
            System.out.print(nomeMes+" é o mês (2)");
        }
        else if (nomeMes.equalsIgnoreCase("marco")) {
            System.out.print(nomeMes+" é o mês (3)");
        }        
        else if (nomeMes.equalsIgnoreCase("abril")) {
            System.out.print(nomeMes+" é o mês (4)");
        }
        else if (nomeMes.equalsIgnoreCase("maio")) {
            System.out.print(nomeMes+" é o mês (5)");
        }
        else if (nomeMes.equalsIgnoreCase("junho")) {
            System.out.print(nomeMes+" é o mês (6)");
        }
        else if (nomeMes.equalsIgnoreCase("julho")) {
            System.out.print(nomeMes+" é o mês (7)");
        }
        else if (nomeMes.equalsIgnoreCase("agosto")) {
            System.out.print(nomeMes+" é o mês (8)");
        }
        else if (nomeMes.equalsIgnoreCase("setembro")) {
            System.out.print(nomeMes+" é o mês (9)");
        }
        else if (nomeMes.equalsIgnoreCase("outubro")) {
            System.out.print(nomeMes+" é o mês (10)");
        }
        else if (nomeMes.equalsIgnoreCase("novembro")) {
            System.out.print(nomeMes+" é o mês (11)");
        }
        else if (nomeMes.equalsIgnoreCase("dezembro")) {
            System.out.print(nomeMes+" é o mês (12)");
        }
        else {
             System.out.print(nomeMes+" não existe ou contém algum erro"
                     + "ortográfico!");
    
    }
         
    }
    
}
    

