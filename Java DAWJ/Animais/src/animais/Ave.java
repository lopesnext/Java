/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author lopes
 */
public class Ave extends Animal{

    public Ave() {
    }
    public void voar(){
        System.out.println("Está a voar");
    }
    
    public void porOvos(){
        System.out.println("Está por ovos");
    }

    @Override
    public void crescer() {
        super.crescer();
        
        double pesoA;
        pesoA = super.getPeso();
        
        pesoA = (pesoA * 0.02) + pesoA;
        
        super.setPeso(pesoA);
        
        double comprA = super.getComprimento();
        
        comprA = (comprA * 0.01) + comprA;
        
        super.setComprimento(comprA);
        
       // super.setPeso(super.getPeso()*0.02);
    }
    
    
}
