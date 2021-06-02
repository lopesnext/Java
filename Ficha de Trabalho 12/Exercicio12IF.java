
import java.util.Scanner;

 /*Usando  IF //Desenvolva um programa que:Pergunte o preço de três produtos e 
  informe qual o produto que deve comprar, sabendo que a decisão é 
  /*  sempre pelo mais barato
package exercicio12;

/**
 *
 * @author lopes
 */
public class Exercicio12IF {
            
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // declaramos 3 variaveis reais, para cada um dos produtos
       double produto1, produto2, produto3;
       
       Scanner input = new Scanner(System.in);
       
       //pedimos o preimeiro valor ao utilizador 
       System.out.println("Insira o valor do primeiro produto");
       
       produto1 = input.nextDouble();
       
       //Pedimos o segundo valor ao utilizador
       System.out.println("Insira o valor do segundo produto");
       
       produto2 = input.nextDouble();
       
       //Pedimos o terceiro valor ao utilizador
       System.out.println("Insira o valor do terceiro produto");
       
       produto3 = input.nextDouble();
       
     //Estrurura de decisão, para determinar qual dos tres valores é mais baixo
     //Nesta primeira determinamos que nãon existe outro valor mais baixo que 
     // o produto1, fazendo uma comparação entre os outros dois valores!
       if (produto1 < produto2 && produto3 > produto1) {
        
        System.out.println("O primeiro produto com o valor de "
                + String.format("%.2f",produto1)+ " €, é a ecolha "
                        + "mais acertada!");      
        
    }   //Determinar que o o produto2 é o mais baixo dos 3 valores     
       else if (produto2 < produto1 && produto3 > produto2) {
        
       System.out.println("O Segundo produto com o valor de "
               + String.format("%.2f",produto2)+ " €, é a "
                       + "escolha mais certada!");
               
    }   //por fim, o mesmo para o produto3, saber se o mesmo tem o valor
       //mais baixo
       else if (produto3 < produto1 && produto2 > produto3) {;
            
        System.out.println("O terceiro produto com o valor de "
                 + String.format("%.2f", produto3) + " €, "
                         + "é a escolha mais acertada");   
                  
       }
        //Neste caso, vamos prever se existem dois valores como valor identico, 
       // de forma a haver a possibilidade de haver dois produtos como uma boa 
       //escolha
       //Comparando o porduto1 com o produto2, caso ambos sejam iguais, e um 
       //deles, sendo que têm o mesmo valor, for menor que o terceiro valor,
       // ficamos a saber que ambos são a escolha acertada!
        else if (produto1 == produto2 && produto2 < produto3){
                System.out.println("O produto1 e produto2 têm o mesmo valor de "
                         + String.format("%.2f", produto1) + " €, logo são a "
                             + "escolha mais acertada"); 
                }
        
        // a semelhança da instrução acima, é identica, sendo que variam as 
        //variaveis, avaliando outras possibilidades e combinações possiveis 
        else if (produto2 == produto3 && produto2 < produto1){
                System.out.println("O produto2 e produto3 ambos com o valor de"
                        + String.format("%.2f", produto3) +" €, são a"
                             + "escolha mais acertada!"); 
                }
        // a terceira e ultima comparação, sendo que tambem so variam as 
        //variavies, de forma a avaliar outras possibilidades.
        else if (produto1 == produto3 && produto1 < produto2) {
            
            System.out.println("O produto1 e produto3, ambos com o valor de "
                        + String.format("%.2f",  produto3)+ " €, são a "
                                + "escolha mais acertada!");
                        
        }
         //Por fim, caso nenhuma das possibilidades anteriores seja valida, 
        // só nos resta determinar que todos os valores são identicos.
       else {
        System.out.println("Qualquer produto é uma escolha acertada!");      
        }
    }
}
    
    

