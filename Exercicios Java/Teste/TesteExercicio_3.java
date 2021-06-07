/*
Exercício 3Desenvolva um programa que solicite ao utilizador o seu nome, 
profissão e valor das vendas no mês corrente. Usando a estrutura lógica 
Switch ... Case, mostre:Caso a profissão seja Comercial, o ordenado é 1200€ e
tem um prémio de 40% sobreo valor das vendasCaso a profissão seja Tecnico, o 
ordenado é 800€ e tem um prémio de 20% sobre o valor das vendasCaso a 
profissão seja Diretor, o ordenado é 1700€ e tem um prémio de 30% sobre o valor
das vendasCaso a profissão seja Gerente, o ordenadoé 1500€ e tem um prémio de
20% sobre o valor das vendasNo final, o programa deve mostrar o nome e profissão
do utilizador, bem como o valor do prémio e o valor final do prdenado 
com o prémio.
 */
package testeexercicio_3;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class TesteExercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        String nome, profissao="space ";
        int opcao;
        double valorVendas,ordenado=0,premio=0;
        double ordenadoFinal;
        System.out.print("Insira o nome:");
        
        nome = input.nextLine();
        
        System.out.println("Escolha a profissão:"
                + "[1]Comercial"
                + "[2]Tecnico"
                + "[3]Diretor"
                + "[4]Gerente");
        
            opcao = input.nextInt();
        
        System.out.print("Insira o valor das vendas do mes:");
        
        valorVendas = input.nextDouble();
        
                  
        switch (opcao) {
            
            case 1:
                profissao = "comercial";
                ordenado = 1200;
                premio = 0.40;
                break;
            case 2:
                profissao = "tecnico";
                ordenado = 800;
                premio = 0.20;
                break;
            case 3:
              profissao = "diretor";
              ordenado = 1700;
              premio = 0.30;
              break;
            case 4:
                profissao = "gerente";
                ordenado = 1500;
                premio = 0.20;
                break;
            default:
                System.out.print("Profissão inválida ou contém algum "
                        + "erro ortográfico");
                        
        }         
                 ordenadoFinal = ordenado + (valorVendas * premio); 
                 
            System.out.println("O funcionário "+nome);
            System.out.println("Profissão "+profissao); 
            System.out.println("Prêmio sobre as vendas: "+premio+"%" );
            System.out.println("Ordenado base: "+ordenado+ " Euros");
            System.out.println("Oredenado final:"+ordenadoFinal+" Euros");        
              
    }       
    
}
