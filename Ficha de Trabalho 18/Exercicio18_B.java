/*
 18B. Escreva um programa Java para exibir a velocidade, em metros por segundo,
quilômetros por hora e milhas por hora.Entrada do utilizador:
A distância(em metros) eo tempo que demorou a percorreressa distância (horas,
minutos e segundos)Nota: 1 milha = 1609 metros

 */
package exercicio18_b;

import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class Exercicio18_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
    {
        Scanner input = new Scanner (System.in);
         
        double mSegundo, kmHora, milhasHora, tempoSegundos;
        
        double hora, min, sec, distancia;
         
        System.out.print("Inisra a distância em metros? ");
        distancia = input.nextInt();
        
       System.out.print("Insira as horas: ");
		hora = input.nextDouble();

		System.out.print("Insira os minutos: ");
		 min = input.nextDouble();

		System.out.print("Insira os segundos: ");
		sec = input.nextDouble();
        
        tempoSegundos = (hora*3600) + (min*60) + sec;
		mSegundo = distancia / tempoSegundos;
		kmHora = ( distancia/1000.0f ) / ( tempoSegundos/3600.0f );
		milhasHora = kmHora / 1.609f;
	
        
        System.out.println("A velocidade é " 
                + String.format("%.1f", mSegundo)+ " metros por segundo.");
        System.out.println("A velocidade é "
                + String.format("%.1f", kmHora)+" quilómetros por hora.");
        System.out.println("A velocidade é "
                + String.format("%.1f", milhasHora)+" milhas por hora.");
        
    }
    }
}
