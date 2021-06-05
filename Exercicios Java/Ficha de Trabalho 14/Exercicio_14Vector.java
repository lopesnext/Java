/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14_d;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio_14Vector {
    
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
       
        String [] numOrdinais = {"primeira", "segunda", "terceira", "quarta", 
        "quinta", "sexta", "setima", "oitava", "nona", "decima"};
                
        String aprovado = "aprovado";
        int numNotas;
        double mediaNotas = 0;
        double somaNotas = 0;
        int calcMedia = 5 ;
        double limiteAprovado = 9.5;
        double nota;
       
        
       System.out.println("Insira o numero de notas que pretende introduzir");
          
          
          numNotas = input.nextInt();
       
          
        for (int i= 0; i >= numNotas; i++) {
            
           System.out.println("Insira a "+numOrdinais+" nota: ");  
           
           nota = input.nextDouble();
           
           somaNotas = (nota + somaNotas);
        
           // Utilizar a estrutura de decisão switch, de forma a facilitar
           // a variação da String "numeroNota", sendo que não temos de 
           // repetir sempre as mesmas instruções.
           // variavel "i" é inciciada com a String "primeira", que 
           //chega com valor de 0 a esta decisão, sendo que troca pela Srting
           // indicada a cada passagem pela nossa estrurura de decisão
           // a real contagem de i é de 0 a 4, representando 5 valores, pois 
           // inicia em 0
          
         /**  
            switch (i) {
            case 0:
                ordinalNota = new String ("segunda");
               break;
            case 1:
                ordinalNota = new String ("terceira");
                break;
            case 2:
                ordinalNota = new String ("quarta");
                break;
            case 3:
                ordinalNota = new String ("quinta");
                break;              
        }
        */ 
           // apos todos os valores somados na variavel "somaNotas", basta
           // apenas dividir pelo numero de notas introduzidas, sendo um valor
           // fixo de 5 notas, temos a constante "calcMedia" com valor de 5.
            mediaNotas = (somaNotas/calcMedia);
        }
        // Determina se o aluno foi aprovado ou não, com base na constante 
        // limiteAprovado, com valor de 9.5, recebendo a String com a situação
        // adequada a cada decisão.
           if (mediaNotas >= limiteAprovado) {
              
              aprovado = new String ("aprovado");
           }   
           else if
                (mediaNotas < limiteAprovado) {
               
               aprovado = new String ("reprovado");
        
           }
                                                                  
             System.out.println("O aluno "+aprovado+" com media de: "
                     + String.format("%.1f",mediaNotas)+ " valores."); 
             
        
    } 
}

