/*
Avancado1:
O Sr. Manuel expandiu seus negócios para além dos negócios e agora possui uma 
loja de conveniência.
Faça um programa que implemente uma caixa registradora rudimentar. 
O programa deverá 
receber um número desconhecido de valores referentes aos preços das mercadorias.
Um valor zero deve ser informado pelo operador para indicar o final da compra. 
O programa deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco. 
Após esta operação, o programa deverá voltar ao ponto 
inicial, para registrar a próxima compra. A saída deve ser conforme o
exemplo abaixo: 

Exemplo: Lojas Tabajara 
 Produto 1: € 2.20 
 Produto 2: € 5.80 
 Produto 3: € 1.00 
 Total: €9.00 
 Dinheiro: €20.00 
 Troco: € 11.00 
 */
package avançado1;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Avançado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       
      double valorProduto=0, total=0, valorRecebido, troco;
      
      int flag=1,i=1;
      
      while (flag==1) {
          // i recebe 1 para limpeza da varivel
          i=1; 
      System.out.println("insira os preço dos produtos:");
      
      do {       
             
             System.out.println("Insira o "+i+" produto");
                        i++;
            
             valorProduto = input.nextDouble();
                        
             total = total + valorProduto; 
         
                  
      }while (valorProduto !=0);
      
      System.out.println("Total para pagamento: "
              + String.format("%.2f", total));
      
      System.out.println("insira o valor recebido:");
      
      valorRecebido = input.nextDouble();
      
     troco = valorRecebido - total;
     
     System.out.println("Troco a entregar: "
             + String.format("%.2f",troco));
      
      System.out.println("O que pretende realizar?"
              + "[1]Nova Compra"
              + "[2]Encerrar");
    
      flag = input.nextInt();
      }
    }
    
}
