
package ec.edu.intsuperior.controlador;

import java.util.Scanner;



public class Automovil {
    String placa;
    int matricula;
    String chasis;
    
    public void asignarPlaca(){
        Scanner leer= new Scanner(System.in);
        System.out.println(" Ingrese su numero de placa: ");
      matricula = leer.nextInt();
        System.out.println("Su numero de placa es: "+ matricula);
        
        
    }           
    
}
