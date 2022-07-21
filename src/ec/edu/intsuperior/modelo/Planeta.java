
package ec.edu.intsuperior.modelo;


public class Planeta {
     String nombre =null; 
     int satelites = 0;
     double kilogramos = 0;
     double kilometrosVolumen = 0;
     int kilometrosDiametro = 0;
     int distanciaSol = 0 ;
     enum tipoPlaneta{GASEOSO, TERRESTRE, ENANO}
     tipoPlaneta tipo;
     boolean observable = false;
      
    Planeta(String n, int s, double k, double kv, int kd, int ds,tipoPlaneta tipo, boolean o){
        
        this.nombre = nombre;
        this.satelites = satelites;
        this.kilogramos = kilogramos;
        this.kilometrosVolumen = kilometrosVolumen;
        this.kilometrosDiametro = kilometrosDiametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
        
        System.out.println("Nombre del planeta" + nombre);
        System.out.println("Cantidad de satelites" + satelites);
        System.out.println("Masa del planeta " + kilogramos);
        System.out.println("Volumen Planeta" + kilometrosVolumen);
        System.out.println("Diametro del Planeta" + kilometrosDiametro);
        System.out.println("Distancia al Sol"+ distanciaSol);
        System.out.println("Tipo de planeta" + tipo);
        System.out.println("Es observable" + observable);
        
        
        
        
    }
}
