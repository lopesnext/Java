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
public class AnimaisApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ave piriquito = new Ave();
        
        piriquito.setPeso(5.1);
        piriquito.setComprimento(1);
        
        System.out.println("O peso do piriquito é de:"+piriquito.getPeso());
        
        piriquito.crescer();
        
        System.out.println("O peso do piriquito é de:"+piriquito.getPeso());
        
        
        
        System.out.println("O comprimento é de:"+piriquito.getComprimento());
        
        System.out.println("O comprimento apos crescimento é de:"
                + ""+piriquito.getComprimento());
        
        Tosquiador ze = new Tosquiador();
        
        Ovelha chone = new Ovelha();
        chone.setIdade(21);
        chone.setPeso(30);
        chone.setComprimento(15);
       System.out.println("A ovelha chone tem :"+chone.getIdade()+"Anos");
       System.out.println("A ovelha chone tem :"+chone.getPeso()+"quilos");
       System.out.println("A ovelha chone tem :"+chone.getIdade()+"metros de comprimento ");
       
       chone.emitirSom();
        ze.tosquiar(chone);
        
        
        
    }
    
}
