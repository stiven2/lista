/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listado;

/**
 *
 * @author InstFisica
 */
public class Listado {

    
    public static void main(String[] args) {
        
        Materia e[] = new Materia[2];
        
        for(int i=0; i<e.length; i++){
        
            e[i] = new Materia();
            e[i].load_nota();
        
        
       }
            
       for(int i=0; i<e.length; i++){
        
          e[i].mostrar_nota();
            
       }      
            
            
            
    }
    
}
