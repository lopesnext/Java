/*
** Exercicio16_BDesenvolva um programa que:Leia um nome de Utilizadore a sua 
**senha e nãoaceite a senha igual ao nome do utilizador,
**mostrando uma mensagemde erro e voltando a pedir as informações.
 */
package exercicio16_b;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio16_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
        
        String user, senha;
        
            
        do{
        System.out.println("Insira o nome de utilizador");
        
        user = input.nextLine();
        
         System.out.println("Insira a password");
        
         senha= input.nextLine();
         
         
         // uso do metodo equals para comparar conteudos de strings      
           
         if (user.equals(senha)) {
             
             System.out.println("O nome não pode ser igual a senha");
         }else{
             
         }
         
        }while ( user.equals(senha));
     
        System.out.print("Sucesso, a sua conta de utilizador foi criada!!!");
    }
    
}
