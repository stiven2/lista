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
public class Estudiante {
   private Scanner lector;
   private String nombre;
   private String apellido;
   private int cedula;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
   
   
   public void mostrar(){
   
   System.out.println("\nNombre: \n"+getNombre());
   System.out.println("\nApellido: \n"+getApellido());
   System.out.println("\nDuracion: \n"+getCedula());
   
  }
   
    public void ingresar(){
        
    lector = new Scanner(System.in);
    System.out.println(" Ingrese el nombre");
    nombre = lector.next();       
    System.out.println(" Ingrese el apellido");   
    apellido = lector.next();
    System.out.println(" Ingrese la cedula");   
    cedula = lector.nextInt();
    
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
