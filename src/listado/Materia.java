/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listado;
import java.util.Scanner;
/**
 *
 * @author InstFisica
 */
public class Materia extends Estudiante {
    
    private Scanner lector;
    private float nota;

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public void mostrar_nota(){
     
        mostrar(); //se puede llamar asi, ya que esta no recibe ni ingresa datos
        System.out.println("\nNota: \n"+getNota());
        }
    
    
     public void load_nota(){
       
    ingresar();
    lector = new Scanner(System.in);
    System.out.println(" Ingrese la nota");
    nota = lector.nextFloat();       // Recibo el titulo y guardo 
    
    }
   
   
}
    
    
    
    
    
    

