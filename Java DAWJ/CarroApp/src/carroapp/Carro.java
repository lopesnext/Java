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
public class Carro {
        //Atributos
    private String matricula;
    public int velocidadeAtual = 0;
    public int velocidadeMaxima = 200;

    //Construtor da Classe
    //Este é o contrutor por defeito
    public Carro(){
        
    }
    
    //Métodos
    public void ligar(){
        System.out.println("O carro ligou!...");
    }
    
    public void desligar(){
        System.out.println("O carro desligou!...");
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void acelerar(){
        this.velocidadeAtual = this.velocidadeAtual + 10;
        
        if(this.velocidadeAtual > this.velocidadeMaxima){
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }
    
    public void travar(){
        this.velocidadeAtual = this.velocidadeAtual - 10;
        
        if(this.velocidadeAtual < 0){
            this.velocidadeAtual = 0;
        }
    }
    
    public void buzinar(){
        System.out.println("Buzina do carro...");
    }
}

