/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroapp;

/**
 *
 * @author lopes
 */
public class CarroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //Criar um objeto do tipo Carro
        Carro c1 = new Carro();
        
        //c1.matricula = "AA01AA";
        c1.setMatricula("AA01AA");
        c1.ligar();
        
        //System.out.println("A matrícula do carro é "+c1.matricula);
        System.out.println("A matrícula do carro é "+c1.getMatricula());
        System.out.println("A velocidade atual "+ c1.velocidadeAtual);
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("A velocidade atual é: "+c1.velocidadeAtual);
        c1.travar();
        
        System.out.println("A velocidade atual é: "+c1.velocidadeAtual);
        
        c1.buzinar();
        
        c1.desligar();
        
        Carro c2 = new Carro();
        
        //c2.matricula = "AB40AA";
        c2.ligar();
        
       // System.out.println("A matrícula do carro é "+c2.matricula);
        System.out.println("A velocidade atual "+ c2.velocidadeAtual);
        
        //Condutor
        Condutor pessoa1 = new Condutor();
        
        pessoa1.nome = "Ana";
        pessoa1.idade = 20;
        pessoa1.genero = "feminino";
        
        System.out.println("O condutor "+pessoa1.nome+" é do género "+ pessoa1.genero+" e tem "+pessoa1.idade+" anos.");
    
        //Declarar um carro do tipo citadino
        Citadino citadino1 = new Citadino();
        
        System.out.println("-------------");
        citadino1.setMatricula("55-XZ-99");
        citadino1.ligar();
        citadino1.acelerar();
        System.out.println("Citadino tem a matrícula "+citadino1.getMatricula());
        System.out.println("Citadino tem a velocidade atual "+citadino1.velocidadeAtual);
        citadino1.ligarACManual();
        citadino1.desligar();
        
        //Declarar um Jipe
        Jipe jipe1 = new Jipe();
        
        System.out.println("---------");
        jipe1.setMatricula("89-11-XX");
        jipe1.ligar();
        jipe1.ligarTracao4x4();
        jipe1.acelerar();
        System.out.println("Jipe tem a matricula" +jipe1.getMatricula());
        System.out.println("Jipe tema  velocidade atual"+jipe1.velocidadeAtual);
        jipe1.desligar();
        
        // Declarar Familiar
        Familiar familiar1 = new Familiar();
        System.out.println("---------");
        familiar1.setMatricula("55-55-GG");
        familiar1.ligar();
        familiar1.desligarAirbagPassageiro();
        familiar1.acelerar();
        System.out.println("Jipe tem a matricula" +familiar1.getMatricula());
        System.out.println("Jipe tema  velocidade atual"+familiar1.velocidadeAtual);
        familiar1.desligar();
    }
    
}
 
