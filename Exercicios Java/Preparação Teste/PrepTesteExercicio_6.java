/*
6. Desenvolva um programa que:
* Peça o nome ao utilizador.
* Peça o valor do ordenado.
* pergunte qual o cargo que ocupa e de acordo com o cargo tenha direito a
* um prémio:
 - Diretor - prémio de 30% em relação ao salário
 - Gerente - prémio de 25% em relação ao salário
 - Operacional - prémio de 20% em relação ao salário
 */
package preptesteexercicio_6;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class PrepTesteExercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         
         String nomeFuncionario;
         
         double valorOrdenado,percentagem=0, salarioFinal;
         
         int opcao;
         
         System.out.println("Insira o nome do funcionário: ");
         
         nomeFuncionario = input.nextLine();
         
         System.out.println("Insira o valor do ordenado: ");
         
         valorOrdenado = input.nextDouble();
         
         System.out.println("Qual é o cargo do funcionario: "
                 + "[1]Diretor;"
                 + "[2]Gerente;"
                 + "[3]Operacional");
                 
         opcao = input.nextInt();
         
         switch (opcao) {
             
             case 1 :
                  percentagem = 0.30;
                  break;
             case 2:
                 percentagem = 0.25;
                 break;
             case 3:
                 percentagem = 0.20;
                 break;
             default:
                 System.out.println("Opção inválida!");
            
             }        
              
             salarioFinal = valorOrdenado + (valorOrdenado * percentagem);
             
             System.out.println("O funcionario: " +nomeFuncionario);    
             System.out.println("O salario final é de: "+salarioFinal+" Euros");   
         }
    }
    
    

