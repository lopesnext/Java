
package exercicio12switch;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio12Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos uma variavel do tipo string
             String turno;
                   
         Scanner input = new Scanner(System.in);
         
         // fazesmos display das possibilidades de escolha ao utilizador
          System.out.println("Em que turno estuda? :"
                  + " M = Matutino"
                  + " V = Vespertino"
                  + " N = Noturno");
        
        turno = input.nextLine();
        
        // Utilzamos a estrurura de decisão SWITCH CASE
       switch (turno) {
           
           // Caso o utilizador insira o caractere M, ele ira fazer display 
           // da mensagem abaixo.
           //Nestas possibilidades de escolha, usamos duas possibilidas "M", "m"
           //tornando a escolha das opções Case-Insensitive!! 
           case "M":
                case "m":
              System.out.println("Bom dia(:");
               break;
           case "V":
                case "v":
               System.out.println("Boa Tarde(:");
                break; 
            case "N":
                    case "n":
                 System.out.println("Boa Noite(:");
                    break;
            // Nesta ultima, caso nehuma escolha acima determinada for escolhida
            // ele por fim executa a default, poderia ser uma mensagem, como
            //outra instrução qualquer!!!
           default:
                System.out.println("Turno inválido");
                break;
       } 
    }
    

    }
    

