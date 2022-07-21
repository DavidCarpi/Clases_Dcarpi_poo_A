
package ec.edu.intsuperior.modelo;


public class Ruedas {
    String modelo;
    String marca;
    int numeroDiametro;

    public Ruedas(String modelo, String marca, int numeroDiametro) {
        this.modelo = modelo;
        this.marca = marca;
        this.numeroDiametro = numeroDiametro;
        
        System.out.println("Ingrese modelo de las ruedas: "+ modelo) ;
        System.out.println("Ingresa marca: " + marca);
        System.out.println("Ingrese diametro de la rueda: " + numeroDiametro);
    }
    
}
