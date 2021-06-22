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
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Abrir 1a. conta
        ContaBancaria conta1 = new ContaBancaria(123,"David Sousa", 1000.0);
        System.out.println("N.º "+conta1.getNumero()+" do Titular "+
                conta1.getTitular()+" tem o saldo de "+conta1.getSaldo()+"€");
        conta1.depositar(100);
        System.out.println("Saldo: "+conta1.getSaldo()+"€");
        conta1.levantar(20);
        System.out.println("Saldo: "+conta1.getSaldo()+"€");
        
        //Abrir 2a. conta
        ContaBancaria conta2 = new ContaBancaria(123,"Maria Cruz", 0.0);
        System.out.println("N.º "+conta2.getNumero()+" do Titular "+
                conta2.getTitular()+" tem o saldo de "+conta2.getSaldo()+"€");
        conta2.depositar(100);
        System.out.println("Saldo: "+conta2.getSaldo()+"€");
        conta2.levantar(120);
        System.out.println("Saldo: "+conta2.getSaldo()+"€");
    }
    
}

