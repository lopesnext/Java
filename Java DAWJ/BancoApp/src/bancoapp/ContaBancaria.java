/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

/**
 *
 * @author lopes
 */
public class ContaBancaria {
 //Atributos
    private int numero;
    private String titular;
    private double saldo;
    
    //Construtores

    public ContaBancaria() {
    }

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //Métodos

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public double levantar(double valor){
        
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente para efetuar levantamento");  
        }
        else{
            this.saldo = this.saldo - valor;
        }
        return this.saldo;
    }
    
    
}